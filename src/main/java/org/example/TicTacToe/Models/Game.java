package org.example.TicTacToe.Models;

import org.example.TicTacToe.Exception.InvalidMoveException;
import org.example.TicTacToe.Strategy.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private int size;
    private Board board;
    private List<Player> players;
    private  List<Move> moves;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;

    public static Builder getBuilderr(){
        return new Builder();
    }

    private Game(int size, List<Player> players,List<WinningStrategy> winningStrategies) {
        //this.size = size;
        this.board=new Board(size);
        this.players = players;
        this.moves = new ArrayList<>();
        this.gameState = GameState.IN_PROGRESS;
       // this.winner = winner;
        this.nextPlayerIndex = 0;
        this.winningStrategies = winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void printBoard(){
        board.printBoard();
    }

    public void undo(){
        int n=moves.size();
        if(n<=0){
            System.out.println("No moves to undo");
        }
        else {
            Move lastmove = moves.remove(n - 1);
            Cell lastcell = lastmove.getCell();

            lastcell.setCellState(CellState.EMPTY);
            int row = lastcell.getRow();
            int col = lastcell.getCol();
        }



    }

    public boolean validateMove(Move move){
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();

        if(row<0 || row>=board.getSize()) return false;
        if(col<0 || col>=board.getSize()) return false;

        if(!move.getCell().getCellState().equals(CellState.EMPTY)){
            return false;
        }
        return true;

    }
    public void makeMove() throws InvalidMoveException {
        Player curplayer=players.get(nextPlayerIndex);
        System.out.println("This is "+curplayer.getName()+"'s Move");
        Move move=curplayer.makeMove(board);
        //player haschoosen the move now time to validate

        if(!validateMove(move)){
            //Throw some Exception.
            throw new InvalidMoveException("Move You want to make is not Correct");
        }

        int row=move.getCell().getRow();
        int col=move.getCell().getCol();

        Cell cell=board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(curplayer);

        Move finalmove=new Move(curplayer,cell);
        moves.add(finalmove);

        nextPlayerIndex=(nextPlayerIndex+1)%players.size();

        for(WinningStrategy winningStrategy:winningStrategies){
            if(winningStrategy.checkWin(board,finalmove)){
                winner=curplayer;
                gameState=GameState.ENDED;
            }
            else{
                if(moves.size()==board.getSize()* board.getSize()){
                    winner=null;
                    gameState=GameState.DRAW;
                }
            }
        }
    }

    public static class Builder{
        private int size;
        //private Board board;
        private List<Player> players;
        //private  List<Move> moves;
        //private GameState gameState;
        //private Player winner;
        //private int nextPlayerIndex;
        private List<WinningStrategy> winningStrategies;

        public Builder() {
            this.size = 0;
            this.players = null;
            this.winningStrategies = null;
        }

        private void validateBotcount(){
            int count=0;
            for(Player player:players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    count++;
                    if(count>1){
                        throw new RuntimeException("Only one Bot is Allowed");
                    }
                }
            }
        }

        private void uniqueSymbolValidation(){
            Set<Character> symbolSet=new HashSet<>();
            for(Player player:players){
                if(!symbolSet.add(player.getSymbol().getaChar())){
                    throw new RuntimeException("Select Different Symbol");
                }
            }
        }
        private void checkValidation(){
            if(size<1) {

                throw new RuntimeException("Invalid Player Count");
            }


        }

        private void validation(){
            validateBotcount();
            checkValidation();
            uniqueSymbolValidation();

        }
        public Game build(){
            //Check for Validation.
            validation();
            return new Game(size,players,winningStrategies);

        }

        public Builder setSize(int size) {
            this.size = size;
            return  this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return  this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return  this;
        }
    }
}

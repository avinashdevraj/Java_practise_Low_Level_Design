package org.example.TicTacToe.Controllers;

import org.example.TicTacToe.Exception.InvalidMoveException;
import org.example.TicTacToe.Models.Game;
import org.example.TicTacToe.Models.GameState;
import org.example.TicTacToe.Models.Player;
import org.example.TicTacToe.Strategy.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game.getBuilderr().setSize(size)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
          game.makeMove();
    }
    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void undo(Game game){
        game.undo();

    }
}

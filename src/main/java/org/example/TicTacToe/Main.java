package org.example.TicTacToe;

import org.example.TicTacToe.Controllers.GameController;
import org.example.TicTacToe.Exception.InvalidMoveException;
import org.example.TicTacToe.Models.*;
import org.example.TicTacToe.Strategy.WinningStrategy.ColWinningStrategy;
import org.example.TicTacToe.Strategy.WinningStrategy.DiagonalWinningStrategy;
import org.example.TicTacToe.Strategy.WinningStrategy.RowWinningStrategy;
import org.example.TicTacToe.Strategy.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("Game Begin");
        Scanner sc=new Scanner(System.in);
        //int size=sc.nextInt();
        int size=3;

        List<Player> players=new ArrayList<>();
        players.add(new Player(new Symbol('X'),"Avinash", PlayerType.HUMAN));
        players.add(new Player(new Symbol('O'),"Muskan", PlayerType.HUMAN));

        //List<WinningStrategy> winningStrategies=new ArrayList<>();

        List<WinningStrategy> winningStrategies=List.of(
                new RowWinningStrategy(),
                new ColWinningStrategy(),
                new DiagonalWinningStrategy()
             );

        GameController gameController=new GameController();


        Game game= gameController.startGame(size,players,winningStrategies);

        gameController.printBoard(game);

        while (gameController.checkGameState(game).equals(GameState.IN_PROGRESS)){
            //print the board to check for cell and make a move.
            gameController.printBoard(game);

            System.out.println("Do you want to undo?y/n");
            String isundo=sc.next();
            if(isundo.equalsIgnoreCase("y")){
                gameController.undo(game);
            }
            else{
                gameController.makeMove(game);
            }
        }

        gameController.printBoard(game);
        if(gameController.checkGameState(game).equals(GameState.ENDED)){

            System.out.println(gameController.getWinner(game).getName()+" has won the game");
        }
        else{
            System.out.println("GAME DRAW");
        }
        System.out.println();
        //System.out.println("DEBUG");
    }
}

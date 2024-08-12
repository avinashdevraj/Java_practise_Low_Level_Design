package org.example.TicTacToe.Strategy.Botplayingstrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Cell;
import org.example.TicTacToe.Models.CellState;
import org.example.TicTacToe.Models.Move;

import java.util.List;

public class EassyBotPlayingStrategy implements BotPlayingstrategy {
    @Override
    public Move makeMove(Board board) {
        //for Eassybotplaying we will itrate over the board and fil the first empty cell.

        for (List<Cell> row : board.getBoard()) {
            for (Cell cell : row) {
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}

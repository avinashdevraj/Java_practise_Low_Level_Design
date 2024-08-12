package org.example.TicTacToe.Strategy.WinningStrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Cell;
import org.example.TicTacToe.Models.Move;
import org.example.TicTacToe.Models.Player;

public interface WinningStrategy {
    boolean checkWin(Board board, Move move);
}

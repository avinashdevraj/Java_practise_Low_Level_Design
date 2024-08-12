package org.example.TicTacToe.Strategy.Botplayingstrategy;

import org.example.TicTacToe.Models.Board;
import org.example.TicTacToe.Models.Move;

public interface BotPlayingstrategy {
    Move makeMove(Board board);
}

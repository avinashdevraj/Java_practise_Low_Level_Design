package org.example.TicTacToe.Models;

import org.example.TicTacToe.Factories.BotPlayingStrategyFactory;
import org.example.TicTacToe.Strategy.Botplayingstrategy.BotPlayingstrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingstrategy botPlayingstrategy;

    public Bot(Symbol symbol, String name, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingstrategy = BotPlayingStrategyFactory.getBotPlayingStrategyFactory(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingstrategy getBotPlayingstrategy() {
        return botPlayingstrategy;
    }

    public void setBotPlayingstrategy(BotPlayingstrategy botPlayingstrategy) {
        this.botPlayingstrategy = botPlayingstrategy;
    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingstrategy.makeMove(board);
    }
}

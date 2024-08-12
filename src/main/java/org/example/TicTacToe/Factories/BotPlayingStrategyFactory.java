package org.example.TicTacToe.Factories;

import org.example.TicTacToe.Models.BotDifficultyLevel;
import org.example.TicTacToe.Strategy.Botplayingstrategy.BotPlayingstrategy;
import org.example.TicTacToe.Strategy.Botplayingstrategy.EassyBotPlayingStrategy;
import org.example.TicTacToe.Strategy.Botplayingstrategy.HardBotPlayingStrategy;
import org.example.TicTacToe.Strategy.Botplayingstrategy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingstrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASSY)){
            return new EassyBotPlayingStrategy();
        } else if (botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        }
        else {
            return new HardBotPlayingStrategy();
        }
    }
}

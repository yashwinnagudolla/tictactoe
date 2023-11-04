package tictactoe.strategies.botPlayingStrategy;

import strategies.botPlayingStrategy.BotPlayingStrategy;
import tictactoe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotPlayingStrategy level){
        return switch(level){
            case EASY -> new tictactoe.strategies.botPlayingStrategy.RandomBotPlayingStrategy();
            case MEDIUM -> new tictactoe.strategies.botPlayingStrategy.RandomBotPlayingStrategy();
            case HARD -> new tictactoe.strategies.botPlayingStrategy.RandomBotPlayingStrategy();
        };
    }
}

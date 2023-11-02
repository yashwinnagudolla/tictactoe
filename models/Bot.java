package tictactoe.models;

import strategies.botPlayingStrategy.BotPlayingStrategy;
import tictactoe.models.Player;
import tictactoe.models.BotDifficultyLevel;
import tictactoe.strategies.botPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(tictactoe.models.Symbol symbol, String name, tictactoe.models.BotDifficultyLevel botDifficultyLevel, BotPlayingStrategy botPlayingStrategy) {
        super(symbol, name, tictactoe.models.PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = botPlayingStrategy;
    }

    public tictactoe.models.Move makeMove(tictactoe.models.Board board){
        tictactoe.models.Move move = botPlayingStrategy.makeMove(this,board); // move cell
        move.setPlayer(this); // move player
        return move;
    }

    public tictactoe.models.BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(tictactoe.models.BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }
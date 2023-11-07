package tictactoe;

import java.util.*;

import strategies.botPlayingStrategy.BotPlayingStrategyFactory;
import tictactoe.models.Move;
import tictactoe.models.Symbol;
import tictactoe.models.GameState;
import tictactoe.controller.GameController;
import tictactoe.models.Bot;
import tictactoe.models.BotDifficultyLevel;
import tictactoe.models.Player;
import tictactoe.models.PlayerType;
import tictactoe.strategies.botPlayingStrategy.BotPlayingStrategyFactory;


public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

        System.out.println("Please enter the dimension of the game");
        int dimension = sc.nextInt();

        System.out.println("will there be any bot in the game? Y/N");
        String isBotPresent = sc.next();

        List<Player> players = new ArrayList<>();
        int iteratorNumber = dimension-1;

        if(isBotPresent.equals("Y")){
            iteratorNumber = dimension-2;
        }

        for(int i = 0;i < iteratorNumber;i++) {
            System.out.println("What is the name of the player : " + i + 1);
            String playerName = sc.next();

            System.out.println("What is the character symbol of yhe player " + playerName);
            String characterSymbol = sc.next();

            players.add(new Player(new Symbol(characterSymbol.charAt(0)), playerName, PlayerType.HUMAN));
        }

        if(isBotPresent.equals("Y")){
            System.out.println("What is the name of the Bot");
            String botName = sc.next();

            System.out.println("What is the character of the Bot");
            String characterSymbol = sc.next();

            BotDifficultyLevel DifficultyLevel = BotDifficultyLevel.EASY;

            Bot bot = new Bot(new Symbol(characterSymbol.charAt(0)),botName,DifficultyLevel, BotPlayingStrategyFactory.getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel.EASY));
            players.add(bot);
        }
        Collections.shuffle(players);

        tictactoe.models.Game game = gameController.createGame(dimension,players);
        int playerIndex = 0;
        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            System.out.println("Current board status");
            gameController.displayBoard(game);
            playerIndex++;
            playerIndex = playerIndex % players.size();
            Move movePlayed = gameController.executeMove(game,players.get(playerIndex));
            Player winner = gameController.getWinner(game,movePlayed);
            if(winner != null){
                gameController.displayBoard(game);
                System.out.println("winner is" + winner.getName());
                break;
            }

        }



    }
}

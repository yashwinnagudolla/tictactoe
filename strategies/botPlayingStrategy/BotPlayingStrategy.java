package strategies.botPlayingStrategy;
import tictactoe.models.Player;
import tictactoe.models.Board;
import tictactoe.models.Move;
public interface BotPlayingStrategy {
    public Move makeMove(Player player, Board board);
}

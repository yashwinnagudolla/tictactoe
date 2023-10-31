package tictactoe.strategies.winningStrategy;

import tictactoe.models.Player;
import tictactoe.models.Board;
import tictactoe.models.Move;
public interface WinningStrategy {
    public Player checkWinner(Board board,Move lastMove);
}

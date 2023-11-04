package tictactoe.strategies.botPlayingStrategy;

import strategies.botPlayingStrategy.BotPlayingStrategy;
import tictacetoe.models.Player;
import tictactoe.models.Cell;
import tictactoe.models.CellState;
import tictactoe.models.Move;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Player player, tictactoe.models.Board board){
        for(int i = 0;i < board.getSize();i++){
            for(int j = 0;j < board.getSize();j++){
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    board.getBoard().get(i).get(j).setPlayer(player);
                    board.getBoard().get(i).get(j).setCellState(CellState.FILLED);
                    return new Move(new Cell(i,j), player);
                }

            }
        }
        return null;
    }

}

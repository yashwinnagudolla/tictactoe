package strategies.winningStrategy;

import tictactoe.models.Player;
import tictactoe.models.Board;
import tictactoe.models.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class OrderOneWinningStrategy implements WinningStrategy {
    private int dimension;
    private int symbolAdded;
    private List<HashMap<Character,Integer>> rowSymbolCount;
    private List<HashMap<Character,Integer>> colSymbolCount;
    private HashMap<Character,Integer> topLeftDiagonalSymbolCount;
    private HashMap<Character,Integer> bottomLeftDiagonalCount;
    private HashMap<Character,Integer> cornerSymbolCount;

    public OrderOneWinningStrategy(int dimension){
        rowSymbolCount = new ArrayList<>();
        colSymbolCount = new ArrayList<>();
        for(int i = 0;i < dimension;i++){
            rowSymbolCount.add(new HashMap<>());
            colSymbolCount.add(new HashMap<>());
        }
    }
    public Player checkWinner(Board board,Move lastMove){
        return new Player();

    }

    public boolean isCellTopLeftDiagonal(int row,int col){
        return row == col;
    }

    public boolean isCellBottomLeftDiagonal(int row,int col){
        return (row+col) == dimension-1;
    }



}

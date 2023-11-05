package tictactoe.models;

import tictactoe.models.Player;
import tictactoe.models.CellState;
public class Cell{
    private int row;
    private int col;
    private Player player;
    private CellState cellState;

    public Cell(int row, int col){
        this.row = row;
        this.col = col;
    }

    public Cell(int row, int col, tictactoe.models.Player player){
        this.row = row;
        this.col = col;
        this.player = player;
    }

    public void display(){
        if(player == null){
            System.out.println("| |");
        }else if(this.cellState.equals(cellState.BLOCKED)){
            System.out.println("||||");
        }else{
            System.out.println("|" + player.getSymbol().getSymbolChar()+ "|");
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public tictactoe.models.Player getPlayer() {
        return player;
    }

    public void setPlayer(tictactoe.models.Player player) {
        this.player = player;
    }

    public tictactoe.models.CellState getCellState() {
        return cellState;
    }

    public void setCellState(tictactoe.models.CellState cellState) {
        this.cellState = cellState;
    }
}
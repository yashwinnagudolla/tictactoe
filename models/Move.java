package tictactoe.models;

import tictactoe.models.Cell;
import tictactoe.models.Player;

public class Move{
    private Cell cell;
    private Player player;

    public Move(tictactoe.models.Cell cell, tictactoe.models.Player player){
        this.cell = cell;
        this.player = player;
    }

    public tictactoe.models.Cell getCell() {
        return cell;
    }

    public void setCell(tictactoe.models.Cell cell) {
        this.cell = cell;
    }

    public tictactoe.models.Player getPalyer() {
        return player;
    }
    public void setPlayer(Player player){
        this.player = player;
    }
    public void setPalyer(tictactoe.models.Player palyer) {
        this.player = palyer;
    }
}
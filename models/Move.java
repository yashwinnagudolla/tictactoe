package tictactoe.models;

public class Move{
    private Cell cell;
    private Player player;

    public Move(Cell cell,Player player){
        this.cell = cell;
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPalyer() {
        return player;
    }

    public void setPalyer(Player palyer) {
        this.player = palyer;
    }
}
package tictactoe.models;

class Move{
    private Cell cell;
    private Player palyer;

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
        return palyer;
    }

    public void setPalyer(Player palyer) {
        this.palyer = palyer;
    }
}
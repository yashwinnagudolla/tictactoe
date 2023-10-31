package tictactoe.models;

import tictactoe.models.Move;
import tictactoe.models.Symbol;
import tictactoe.models.PlayerType;
import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.CellState;
import java.util.*;

class Player{
    private String name;
    private static int idCounter = 0;
    private int id;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scanner;

    public Player(Symbol symbol,String name,PlayerType playerType){
        this.id = idCounter++;
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
        this.scanner = new Scanner(System.in);
    }

    public Move makeMove(Board board){
        System.out.println(this.getName() + " Please enter the row for the move");
        int row = scanner.nextInt();
        System.out.println(this.getName() + " Please enter the col for the move");
        int col = scanner.nextInt();
        board.getBoard().get(row).get(col).setPlayer(this);
        board.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        Cell neeCell = new Cell()
        return new Move(new Cell(row,col,this),this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
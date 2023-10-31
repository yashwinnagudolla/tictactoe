package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board{
    private int size;
    private List<List<Cell>> board;

    public Board(int size){
        this.size = size;
        this.board = new ArrayList<>();

        for(int i = 0;i < size;i++){
            this.getBoard().add(new ArrayList<Cell>());
            for(int j = 0;j < size;j++){
                this.getBoard().get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard(){
        for(int i = 0; i < size;i++){
            for(int j = 0;j < size;j++){
                this.getBoard().get(i).get(j).display();
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getBoard(){
        return board;
    }

    public void setBoard(List<List<Cell>> board){
        this.board = board;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
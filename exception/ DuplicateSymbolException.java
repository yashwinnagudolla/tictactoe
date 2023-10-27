package tictactoe.exception;

class DuplicateSymbolException extends RuntimeException{
    public DuplicateSymbolException(String message){
        super(message);
    }
}

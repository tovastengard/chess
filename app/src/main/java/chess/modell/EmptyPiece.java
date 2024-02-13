package chess.modell;

public class EmptyPiece implements Piece {

    private String color;
    private String name;
    private int pos;

    public EmptyPiece(String name) {
        this.name = name;
        this.color = ""; 
    }

    public String getName() {
        return name;
    }

    public int getCurrentPos() {
        return pos;
    }

    public void setCurrentPos(int pos) {
        this.pos = pos;
    }

    public boolean isEmptyPiece() {
        return true;
    }

    public void setColor(char color) {
    }

    public String getColor() {
        return color;
    }

    public Boolean canMove(Board board, Piece other) {
        return false;
    }
    
}

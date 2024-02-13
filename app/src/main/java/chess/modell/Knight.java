package chess.modell;

public class Knight implements Piece {

    private String color;
    private String name;
    private int pos;

    //gets the name "H" for horse
    public Knight(String name) {
        this.name = name;
        this.color = name.charAt(0) == 'w' ? "W" : "B";
    }

    public String getName() {
        return name;
    }

    public int getCurrentPos() {
        return pos;
    }

    public Boolean canMove(Piece other) {
        return !(other.getColor().equals(this.color));
    }

    public Boolean canCapture(Piece other) {
        return true;
    }

    public void setCurrentPos(int pos) {
        this.pos = pos;
    }

    public boolean isEmptyPiece() {
        return false;
    }

    public String getColor() {
        return color;
    } 
}

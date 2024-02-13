package chess.modell;

public class Pawn implements Piece{

    private String color;
    private String name;
    private int pos;

    public Pawn(String name) {
        this.name = name;
        setColor(name.charAt(0));
    }


    public String getName() {
        return name;
    }

    public int getCurrentPos() {
        return pos;
    }

    public Boolean canMove(Board board, Piece other) {
        return !(other.getColor().equals(this.color));
    }

    /* 
    private Boolean isAttack(Piece other) {
        return other.getCurrentPos().equals
    } */

    public void setCurrentPos(int pos) {
        this.pos = pos;
    }

    public void setColor(char color) {
        switch (color) {
            case 'w' -> this.color = "W";
            default -> this.color = "B";
        }
    }

    public boolean isEmptyPiece() {
        return false;
    }


    public String getColor() {
        return color;
    }
    
}

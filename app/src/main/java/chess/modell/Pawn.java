package chess.modell;

public class Pawn implements Pieces{

    private String color;
    private String name;
    private String pos;

    public Pawn(String color, String pos) {
        this.color = color;
        name = color + "P";
        this.pos = pos;
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public Boolean canMove() {
        return true;
    }

    public void setCurrentPos(String pos) {
        this.pos = pos;
    }

    public boolean isEmptyPiece() {
        return false;
    }


    public String getColor() {
        return color;
    }
    
}

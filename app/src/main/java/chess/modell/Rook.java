package chess.modell;

public class Rook implements Pieces{

    private String color;
    private String name;
    private String pos;

    public Rook(String color, String pos) {
        this.color = color;
        name = color + "R";
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

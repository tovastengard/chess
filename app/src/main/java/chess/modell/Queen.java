package chess.modell;

public class Queen implements Pieces {

    private String color;
    private String name;
    private String pos;

    public Queen(String color, String pos) {
        this.color = color;
        name = color + "Q";
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


    public String getColor() {
        return color;
    }

    public boolean isEmptyPiece() {
        return false;
    }
    
}

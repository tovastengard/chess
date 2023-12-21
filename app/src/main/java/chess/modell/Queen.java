package chess.modell;

public class Queen implements Pieces {

    private String color;
    private String name;
    private String pos;

    public Queen(String name) {
        this.name = name;
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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isEmptyPiece() {
        return false;
    }
    
}

package chess.modell;

public class EmptyPiece implements Pieces {

    private String color;
    private String name;
    private String pos;

    public EmptyPiece(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public Boolean canMove() {
        return false;
    }

    public void setCurrentPos(String pos) {
        this.pos = pos;
    }

    public boolean isEmptyPiece() {
        return true;
    }

    public void setColor(String color) {
    }

    public String getColor() {
        return color;
    }
    
}

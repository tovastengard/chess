package chess.modell;

public class Rook implements Pieces{

    private String color;
    private String name;
    private String pos;

    public Rook(String name) {
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

    public void setColor(String color) {
        this.color = color;
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

package chess.modell;

public class Knight implements Pieces {

    private String color;
    private String name;
    private String pos;

    //gets the name "H" for horse
    public Knight(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public void setColor(String color) {
        this.color = color;
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

package chess.modell;

public class Knight implements Piece {

    private String color;
    private String name;
    private String pos;

    //gets the name "H" for horse
    public Knight(String name) {
        this.name = name;
        setColor(name.charAt(0));
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public void setColor(char color) {
        switch (color) {
            case 'w' -> this.color = "W";
            default -> this.color = "B";
        }
    }

    public Boolean canMove(Board board, Piece other) {
        return !(other.getColor().equals(this.color));
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

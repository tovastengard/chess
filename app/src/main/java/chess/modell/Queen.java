package chess.modell;

public class Queen implements Piece {

    private String color;
    private String name;
    private String pos;

    public Queen(String name) {
        this.name = name;
        setColor(name.charAt(0));
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public Boolean canMove(Board board, Piece other) {
        return !(other.getColor().equals(this.color));
    }

    public void setCurrentPos(String pos) {
        this.pos = pos;
    }

    public void setColor(char color) {
        switch (color) {
            case 'w' -> this.color = "W";
            default -> this.color = "B";
        }
    }

    public String getColor() {
        return color;
    }

    public boolean isEmptyPiece() {
        return false;
    }
    
}

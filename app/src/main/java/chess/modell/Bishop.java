package chess.modell;

public class Bishop implements Pieces {

    private String color;
    private String name;
    private String pos;

    public Bishop(String name) {
        this.name = name;
        setColor(name.charAt(0));
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public Boolean canMove(String name, Board board) {
        return true;
    }

    public void setCurrentPos(String pos) {
        this.pos = pos;
    }

    public void setColor(char color) {
        switch (color) {
            case 'W' -> this.color = "W";
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

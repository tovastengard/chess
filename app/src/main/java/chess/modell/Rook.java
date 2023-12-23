package chess.modell;

public class Rook implements Pieces{

    private String color;
    private String name;
    private String pos;

    public Rook(String name) {
        this.name = name;
        setColor(name.charAt(0));
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public Boolean canMove(String name) {
        return true;
    }

    public void setColor(char color) {
        switch (color) {
            case 'W' -> this.color = "W";
            default -> this.color = "B";
        }
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

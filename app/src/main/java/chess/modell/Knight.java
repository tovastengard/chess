package chess.modell;

public class Knight implements Pieces {

    private String color;
    private String name;
    private String pos;

    //gets the name "H" for horse
    public Knight(String name) {
        this.name = name;
        setColor(name.charAt(0));
        System.out.println(name);
    }


    public String getName() {
        return name;
    }

    public String getCurrentPos() {
        return pos;
    }

    public void setColor(char color) {
        switch (color) {
            case 'W' -> this.color = "W";
            default -> this.color = "B";
        }
    }

    public Boolean canMove(String name) {
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

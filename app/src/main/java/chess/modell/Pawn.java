package chess.modell;

public class Pawn implements Piece{

    private String color;
    private String name;
    private int pos;
    private Boolean firstMove;

    public Pawn(String name) {
        this.name = name;
        this.color = name.charAt(0) == 'w' ? "W" : "B";
        firstMove = true;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPos() {
        return pos;
    }

    public Boolean canMove(Piece other) {

        if (color.equals("W") && other.getCurrentPos() > pos) {
            return false;
        }
        if (color.equals("B") && other.getCurrentPos() < pos) {
            return false;
        }
        
        int distance = Math.abs(other.getCurrentPos() - pos);

        if (firstMove) {
            if ((distance == 8 || distance == 16) && other.isEmptyPiece()) {
                firstMove = false;
                return true;
            }
        } else {
            if (distance == 8) {
                return other.isEmptyPiece();
            }
        }
        return false;
    }

    public Boolean canCapture(Piece other) {

        int distance = Math.abs(other.getCurrentPos() - pos);
        if (firstMove) {
            if ((distance == 7 || distance == 9) && !other.isEmptyPiece() && !other.getColor().equals(color)) {
                firstMove = false;
                return true;
            }
        }
        if (distance == 7 || distance == 9) {
            return !other.isEmptyPiece() && !other.getColor().equals(color);
        }
        return false;
    }

    public void setCurrentPos(int pos) {
        this.pos = pos;
    }

    public boolean isEmptyPiece() {
        return false;
    }

    public String getColor() {
        return color;
    }
    
}

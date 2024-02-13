package chess.modell;

public interface Piece {


    public String getName();
    
    public int getCurrentPos();

    public Boolean canMove(Piece other);

    public void setCurrentPos(int pos);

    public String getColor();

    public boolean isEmptyPiece();

    public Boolean canCapture(Piece other);

    
}

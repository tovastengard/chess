package chess.modell;

public interface Piece {


    public String getName();
    
    public int getCurrentPos();

    public Boolean canMove(Board board, Piece other);

    public void setCurrentPos(int pos);

    public String getColor();

    public boolean isEmptyPiece();

    public void setColor(char color);

    
}

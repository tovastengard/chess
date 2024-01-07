package chess.modell;

public interface Piece {


    public String getName();
    
    public String getCurrentPos();

    public Boolean canMove(Board board, Piece other);

    public void setCurrentPos(String pos);

    public String getColor();

    public boolean isEmptyPiece();

    public void setColor(char color);

    
}

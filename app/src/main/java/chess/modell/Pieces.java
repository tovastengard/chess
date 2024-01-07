package chess.modell;

public interface Pieces {


    public String getName();
    
    public String getCurrentPos();

    public Boolean canMove(String name, Board board);

    public void setCurrentPos(String pos);

    public String getColor();

    public boolean isEmptyPiece();

    public void setColor(char color);

    
}

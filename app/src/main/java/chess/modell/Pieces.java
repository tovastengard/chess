package chess.modell;

public interface Pieces {


    public String getName();
    
    public String getCurrentPos();

    public Boolean canMove();

    public void setCurrentPos(String pos);

    public String getColor();

    public boolean isEmptyPiece();

    
}

package chess.modell;

import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;

public class Board extends Observable {
    
    private String[] startingPositions = {
        "br", "bh", "bb", "bq", "bk", "bb", "bh", "br",
        "bp", "bp", "bp", "bp", "bp", "bp", "bp", "bp",
        " ", " ", " ", " ", " ", " ", " ", " ",
        " ", " ", " ", " ", " ", " ", " ", " ",
        " ", " ", " ", " ", " ", " ", " ", " ",
        " ", " ", " ", " ", " ", " ", " ", " ",
        "wp", "wp", "wp", "wp", "wp", "wp", "wp", "wp",
        "wr", "wh", "wb", "wq", "wk", "wb", "wh", "wr"};

    private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

    private Map<String, Piece> boardMap;
    private PieceFactory pf = new PieceFactory();


    public Board() {
        boardMap = createBoardMap();
    }

    public String[] returnBoard() {
        return startingPositions;   
    }

    public Map<String, Piece> returnBoardMap() {
        return boardMap;   
    }


    private TreeMap<String, Piece> createBoardMap() {
        TreeMap<String, Piece> map = new TreeMap<String, Piece>();
        
        for (int i = 0; i < 64; i++) {
            Piece piece = pf.makePiece(startingPositions[i]); 
            piece.setCurrentPos(String.valueOf(i));
            map.put(String.valueOf(i), piece);
        }
        return map;

    }


    public Boolean tryMovePiece(String from, String to) {
        Piece fromPiece = boardMap.get(from);
        Piece toPiece = boardMap.get(to);

        if (fromPiece.canMove(this, toPiece)) {
            boardMap.put(to, fromPiece);
            boardMap.put(from, new EmptyPiece(to));
            setChanged();
            notifyObservers();
            return true;
        }
        return false;
    }

}

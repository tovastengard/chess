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

    private Map<String, Pieces> boardMap;
    private PieceFactory pf = new PieceFactory();


    public Board() {
        boardMap = createBoardMap();
    }

    public String[] returnBoard() {
        return startingPositions;   
    }

    public Map<String, Pieces> returnBoardMap() {
        return boardMap;   
    }


    private TreeMap<String, Pieces> createBoardMap() {
        TreeMap<String, Pieces> map = new TreeMap<String, Pieces>();
        
        for (int i = 0; i < 64; i++) {
            Pieces piece = pf.makePiece(startingPositions[i]); 
            piece.setCurrentPos(String.valueOf(i));
            map.put(String.valueOf(i), piece);
        }
        return map;

    }


    public Boolean tryMovePiece(String from, String to) {
        Pieces fromPiece = boardMap.get(from);
        Pieces toPiece = boardMap.get(to);

        if (fromPiece.canMove(to) && !from.equals(to)) {
            boardMap.put(to, fromPiece);
            boardMap.put(from, new EmptyPiece(to));
            setChanged();
            notifyObservers();
            return true;
        }
        return false;
    }

}

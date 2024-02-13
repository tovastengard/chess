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

    //private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

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
            piece.setCurrentPos(i);
            map.put(String.valueOf(i), piece);
        }
        return map;

    }


    public Boolean tryMovePiece(String from, String to) {
        Piece fromPiece = boardMap.get(from);
        Piece toPiece = boardMap.get(to);
        System.out.println(from + " " + to);

        if (fromPiece.canMove(toPiece) || fromPiece.canCapture(toPiece)) {

            fromPiece.setCurrentPos(Integer.valueOf(to));
            Piece newEmpty = new EmptyPiece(" ");
            newEmpty.setCurrentPos(Integer.valueOf(from));
            
            boardMap.put(to, fromPiece);
            boardMap.put(from, newEmpty);
    
            setChanged();
            notifyObservers();
            return true;
        }
        return false;
    }

}

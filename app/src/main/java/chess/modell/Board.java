package chess.modell;

import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;

public class Board extends Observable {
    
    private String[][] startingPositions = {
        {"BR", "BH", "BB", "BQ", "BK", "BB", "BH", "BR"},
        {"BP", "BP", "BP", "BP", "BP", "BP", "BP", "BP"},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {"WP", "WP", "WP", "WP", "WP", "WP", "WP", "WP"},
        {"WR", "WH", "WB", "WQ", "WK", "WB", "WH", "WR"}
};

    private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

    private Map<String, Pieces> boardMap;
    private PieceFactory pf = new PieceFactory();


    public Board() {
        boardMap = createBoardMap();
    }


    public String[][] returnBoard() {
        return startingPositions;   
    }

    public Map<String, Pieces> returnBoardMap() {
        return boardMap;   
    }


    private TreeMap<String, Pieces> createBoardMap() {
        TreeMap<String, Pieces> map = new TreeMap<String, Pieces>();
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {

                Pieces piece = pf.makePiece(fromStartingPos(i, j, 1));
                piece.setColor(fromStartingPos(i, j, 0));
                piece.setCurrentPos(letters[i - 1] + String.valueOf(j));
                map.put(letters[i - 1] + String.valueOf(j), piece);
  
            }
        }
        return map;

    }

    private String fromStartingPos(int i, int j, int sub) {
        if ((startingPositions[i - 1][j - 1]).length() == 1) {
            return "E";
        }
        return String.valueOf(startingPositions[i - 1][j - 1].charAt(sub));
    }

    
    /*/
    public void updateMap(String piece, String pos) {
        String prevPos = boardMap.get(piece);


    } */



}

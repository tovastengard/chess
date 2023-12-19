package chess.modell;

import java.util.Map;
import java.util.TreeMap;

public class Board {
    
    private String[][] startingPositions = {
        {"R", "N", "B", "Q", "K", "B", "N", "R"},
        {"P", "P", "P", "P", "P", "P", "P", "P"},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {"p", "p", "p", "p", "p", "p", "p", "p"},
        {"r", "n", "b", "q", "k", "b", "n", "r"}
};

    private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"};

    private Map<String, String> boardMap;



    public Board() {
        boardMap = createBoardMap();


    }


    public String[][] returnBoard() {
        return startingPositions;   
    }

    public Map<String, String> returnBoardMap() {
        return boardMap;   
    }


    private TreeMap<String, String> createBoardMap() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                map.put(letters[i - 1] + String.valueOf(j), startingPositions[i-1][j-1]);
            }
        }
        return map;

    }

    /*

    public void updateMap(String piece, String pos) {
        boardMap.re
        String prPos = boardMap.getKey(piece);
    }  */


}

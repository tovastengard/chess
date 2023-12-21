package chess.modell;

import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;

public class Board extends Observable {
    
    private String[][] startingPositions = {
        {"R1", "N1", "B1", "Q", "K", "B2", "N2", "R2"},
        {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8"},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {" ", " ", " ", " ", " ", " ", " ", " "},
        {"p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8"},
        {"r1", "n1", "b1", "q", "k", "b2", "n2", "r2"}
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
                map.put(startingPositions[i-1][j-1], letters[i - 1] + String.valueOf(j));
            }
        }
        return map;

    }

    

    public void updateMap(String piece, String pos) {
        String prevPos = boardMap.get(piece);


    }



}

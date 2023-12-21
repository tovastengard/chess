/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chess;

import org.junit.jupiter.api.Test;

import chess.modell.Board;
import chess.viewController.Chess;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.TreeMap;

class ChessTest {

    @Test
    void BoardMap() {
        Board board = new Board();
        Map<String, String> map = board.returnBoardMap();
        assertEquals("A1", map.get("R1"));
        assertEquals("B1", map.get("P1"));

    }
}

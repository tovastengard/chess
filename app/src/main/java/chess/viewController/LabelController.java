package chess.viewController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import chess.modell.Board;

public class LabelController extends MouseAdapter {

    private Board board;
    private BoardPanel boardPanel;
    private IconLabel prevPosition;
    private Boolean moveNewPiece = false;
    
    public LabelController(Board board, BoardPanel boardPanel) {
        this.board = board;
        this.boardPanel = boardPanel;
    }

       
    public void mouseClicked(MouseEvent e) { 

        if (!moveNewPiece && !isEmpty((IconLabel) e.getSource())) {
            prevPosition = (IconLabel) e.getSource();
            moveNewPiece = true;
            return;
        }

        IconLabel newPos = (IconLabel) e.getSource();

        if (!isEmpty(prevPosition) && board.tryMovePiece(prevPosition.getPos(), newPos.getPos()) && moveNewPiece ) {
            moveNewPiece = false;
        }


    }


    private Boolean isEmpty(JLabel label) {
        try {
            return label.getIcon() == null;
        } catch (Exception e) {
            return true;
        }
    }

    private Boolean samePiece(JLabel label, JLabel other) {
        try {
            return label.getIcon() == other.getIcon();
        } catch (Exception e) {
            return true;
        }
    }
    
}

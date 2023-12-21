package chess.viewController;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import chess.modell.Board;

public class LabelController extends MouseAdapter {

    private Board board;
    private BoardPanel boardPanel;
    private JLabel prevPosition;
    private Boolean moveNewPiece = false;
    
    public LabelController(Board board, BoardPanel boardPanel) {
        this.board = board;
        this.boardPanel = boardPanel;
    }

       
    public void mouseClicked(MouseEvent e) { 

        if (!moveNewPiece && !isEmpty((JLabel) e.getSource())) {
            prevPosition = (JLabel) e.getSource();
            moveNewPiece = true;
            return;
        }
        JLabel newPos = (JLabel) e.getSource();

        if (!isEmpty(prevPosition) && moveNewPiece && !samePiece(prevPosition, newPos) ) {
            newPos.setIcon(prevPosition.getIcon());
            prevPosition.setIcon(null);
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

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

        if (isEmpty(newPos)) {
            newPos.setText(prevPosition.getText());
            prevPosition.setText(" ");
            moveNewPiece = false;
            return;
        }
    }


    private Boolean isEmpty(JLabel label) {
        return label.getText().equals(" ");
    }
    
}

package chess.viewController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class BoardPanel extends JPanel {

    
    public BoardPanel() {

        super(new GridLayout(8, 9, 2, 2));
        setPreferredSize(new Dimension(540, 540));


        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel();
            square.setBackground(getSquareColor(i));
            add(square);
        }

    }

    private Color getSquareColor(int index) {
        int row = index / 8;
        int col = index % 8;
        return (row + col) % 2 == 0 ? Color.WHITE : Color.GRAY; // Alternating colors for squares
    }

    
}

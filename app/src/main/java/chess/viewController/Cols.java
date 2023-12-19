package chess.viewController;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Cols extends JPanel {

    private String[] letters = {"A   ", "B   ", "C  ", "D", "E", "F", "G", "H"};

    public Cols() {
        super(new GridLayout(1, 9, 2, 2));
        setPreferredSize(new Dimension(540, 60));

        add(new JLabel(" ", 0));
        for (String letter : letters) {
            JLabel label = new JLabel(letter, 0);
            add(label);
        }


    }
    
    
}

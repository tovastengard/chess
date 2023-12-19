package chess.viewController;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Rows extends JPanel {


    public Rows() {
        super(new GridLayout(8, 1, 2, 2));
        setPreferredSize(new Dimension(60, 540));
        

        for (int i = 8; i >= 1; i--) {
            JLabel label = new JLabel(String.valueOf(i), 0);
            add(label);
        }
       // add(new JLabel());

    }
    
}

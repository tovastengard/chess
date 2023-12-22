package chess.viewController;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JLabel;

public class IconLabel extends JLabel {

    private String pos;
    private Icon image;

    public IconLabel(Icon image, String pos) {
        super(image, JLabel.CENTER);
        this.pos = pos;
        this.image = image;
        labelPrefs();
    }

    public String getPos() {
        return pos;
    }

    public void labelPrefs() {
        setFont(new Font("Arial", Font.BOLD, 30));
        setPreferredSize(new Dimension(60, 60));
    }

    public void newPos(String pos) {
        this.pos = pos;
    }

}

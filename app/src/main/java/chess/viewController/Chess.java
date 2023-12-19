package chess.viewController;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Chess extends JFrame {


    public Chess() {
        
        super("Chess Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel boardpanel = new BoardPanel();
        JPanel rows = new Rows();
        JPanel cols = new Cols();


        add("West", rows);
        add("South", cols);
        add("Center", boardpanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public String getGreeting() {
        return "Hello";
    }

    public static void main(String[] args) {
        System.out.println(new Chess().getGreeting());
    }
}

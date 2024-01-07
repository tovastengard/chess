package chess.viewController;

import javax.swing.JFrame;
import javax.swing.JPanel;

import chess.modell.Board;


public class Chess extends JFrame {

    private Board board = new Board();


    public Chess() {
        
        super("Chess Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel boardpanel = new BoardPanel(board);
        add("Center", boardpanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }



    public String getGreeting() {
        return "Hello";
    }

    public static void main(String[] args) {
        new Chess();
    }
}

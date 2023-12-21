package chess.viewController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import chess.modell.Board;

public class BoardPanel extends JPanel {

    private Board board;
    private ArrayList<JLabel> list = new ArrayList<JLabel>(64);
    private MouseListener ms;


    
    public BoardPanel(Board board) {

        super(new GridLayout(8, 9, 2, 2));
        setPreferredSize(new Dimension(540, 540));
        this.board = board;
        board.addObserver((obs, obj) -> updateBoard(board));
        ms = new LabelController(board, this);
        makeBoard();
        
    }



    private void makeBoard() {
        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel();
            square.setBackground(getSquareColor(i));

            JLabel pieceLabel = new JLabel(board.returnBoard()[i/8][i%8], JLabel.CENTER);
            
            pieceLabel.setFont(new Font("Arial", Font.BOLD, 40));
            pieceLabel.setPreferredSize(new Dimension(60, 60));
            square.add(pieceLabel);
            list.add(pieceLabel);
            pieceLabel.addMouseListener(ms);
            add(square);
        }
    }

    private Color getSquareColor(int index) {
        int row = index / 8;
        int col = index % 8;
        return (row + col) % 2 == 0 ? Color.WHITE : Color.GRAY; // Alternating colors for squares
    }

    private void updateLabel(JLabel label, String piece) {
        label.setText(piece);
    }

    public void updateBoard(Board board) {

    }


    
}

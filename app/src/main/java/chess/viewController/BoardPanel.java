package chess.viewController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
       // board.addObserver((obs, obj) -> updateBoard(board));
        ms = new LabelController(board, this);
        makeBoard();
        
    }


    private void makeBoard() {
        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel();
            square.setBackground(getSquareColor(i));

            ImageIcon icon = resizeImage(Util.findIcon(i), 60, 60);
            JLabel pieceLabel = new JLabel(icon, JLabel.CENTER);
            
            pieceLabel.setFont(new Font("Arial", Font.BOLD, 30));
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
        return (row + col) % 2 == 0 ? Color.WHITE : Color.GRAY;
    }

    
    private ImageIcon resizeImage(String imagePath, int width, int height) {

        try {
            File file = new File(imagePath);
            BufferedImage originalImage = ImageIO.read(file);
            Image resultingImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            return new ImageIcon(resultingImage);
            } catch (IOException e) {
                return null;
            }
    }   


    
}

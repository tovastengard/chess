package chess.viewController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import chess.modell.Board;
import chess.modell.Piece;

public class BoardPanel extends JPanel {

    private Board board;
    private MouseListener ms;
    private Map<String, ImageIcon> imageList = new TreeMap<String, ImageIcon>();
    private ArrayList<IconLabel> list = new ArrayList<IconLabel>(64);


    public BoardPanel(Board board) {

        super(new GridLayout(8, 9, 2, 2));
        setPreferredSize(new Dimension(540, 540));
        this.board = board;
        board.addObserver((obs, obj) -> updateBoard());
        ms = new LabelController(board, this);
        makeBoard();     
    }

    private void updateBoard() {
        Map<String, Piece> map = board.returnBoardMap();
        for (Map.Entry<String,Piece> entry : map.entrySet()) {
            updateLabel(entry.getKey(), list.get(Integer.valueOf(entry.getKey())), entry.getValue().getName());
        }
    }

    private void updateLabel(String newPos, IconLabel label, String icon) {
        label.setIcon2(imageList.get(icon));
        label.newPos(newPos);
    }

    private void makeBoard() {

        for (int i = 0; i < 64; i++) {
            JPanel square = new JPanel();
            square.setBackground(getSquareColor(i));

            ImageIcon icon = resizeImage(Util.findIcon(i), 60, 60);
            imageList.put(fromUtil(Util.findIcon(i)), icon);

            IconLabel pieceLabel = new IconLabel(icon, String.valueOf(i));
            
            square.add(pieceLabel);
            pieceLabel.addMouseListener(ms);
            add(square);
            list.add(pieceLabel);
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

    private String fromUtil(String s) {
        if (s.length() == 1) {
            return " ";
        }
        return s.substring(7, 9);
    }
        
}

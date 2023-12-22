package chess.modell;

public class PieceFactory {

    PieceFactory() {
    }

    public Pieces makePiece(String p) {

        try {
            char token = p.charAt(1);
            return
            switch (token) {
                case 'r' -> new Rook(p);

                case 'b' -> new Bishop(p);

                case 'h' -> new Knight(p);

                case 'q' -> new Queen(p); 

                case 'k' -> new King(p);

                case 'p' -> new Pawn(p);

                default -> new EmptyPiece(p);

            };

        } catch (Exception e) {
            return new EmptyPiece(p);
        }

    }
    
}

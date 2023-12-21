package chess.modell;

public class PieceFactory {

    PieceFactory() {
    }

    public Pieces makePiece(String p) {
        return

            switch (p) {
                case "R" -> new Rook(p);

                case "B" -> new Bishop(p);

                case "Kn" -> new Knight(p);

                case "Q" -> new Queen(p); 

                case "K" -> new King(p);

                case "P" -> new Pawn(p);

                default -> new EmptyPiece(p);

            }; 




    }
    
}

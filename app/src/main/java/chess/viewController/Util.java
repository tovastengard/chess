package chess.viewController;


public class Util {

    public static String WHITE_PAWN = "images/wpawn.png";
    public static String BLACK_PAWN = "images/bpawn.png";
    public static String WHITE_ROOK = "images/wrook.png";
    public static String BLACK_ROOK = "images/brook.png";
    public static String WHITE_KNIGHT = "images/whorse.png";
    public static String BLACK_KNIGHT = "images/bhorse.png";
    public static String WHITE_BISHOP = "images/wbishop.png";
    public static String BLACK_BISHOP = "images/bbishop.png";
    public static String WHITE_QUEEN = "images/wqueen.png";
    public static String BLACK_QUEEN = "images/bqueen.png";
    public static String WHITE_KING = "images/wking.png";
    public static String BLACK_KING = "images/bking.png";

    

    public static String findIcon(int i) {

        if (i > 7 && i < 16 ) {
            return BLACK_PAWN;
        }
        if (i > 47 && i < 56 ) {
            return WHITE_PAWN; 
        }
        if (i == 0 || i == 7) {
            return BLACK_ROOK; 
        }
        if (i == 56 || i == 63) {
            return WHITE_ROOK;
        }
        if (i == 1 || i == 6) {
            return BLACK_KNIGHT;
        }
        if (i == 57 || i == 62) {
            return WHITE_KNIGHT;
        }
        if (i == 2 || i == 5) {
            return BLACK_BISHOP;
        }
        if (i == 58 || i == 61) {
            return WHITE_BISHOP;
        }
        if (i == 3) {
            return BLACK_QUEEN;
        }
        if (i == 59) {
            return WHITE_QUEEN;
        }
        if (i == 4) {
            return BLACK_KING;
        }
        if (i == 60) {
            return WHITE_KING;
        }
        return " ";

    }

    
}

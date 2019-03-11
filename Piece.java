public class Piece implements PieceInterface {
    private int piecexloc;
    private int pieceyloc;
    public Piece(Board B, int[] piece_coordinates_xy){
        this.piecexloc = piece_coordinates_xy[1];
        this.pieceyloc = piece_coordinates_xy[2];
    }

    public boolean piecemove(){
        return true;
    }
}

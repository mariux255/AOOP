
public class Piece implements PieceInterface {
    private int piecexloc;
    private int pieceyloc;
    private boolean test = true;
    int coordinate1,coordinate2;
    public boolean piecemove(int piecevalue,int coordinatex1, int coordinatex2,int player){
        if(piecevalue!=0){
            test=false;
        }
        if(coordinatex2-coordinatex1<=0 && player==1){
            test=false;
        }
        if(coordinatex2-coordinatex1>=0 && player==2){
            test=false;
        }
        return test;

    }
}

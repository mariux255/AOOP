public class Coordination implements CoordinationInterface {
    private int[][] B;
    public int[][] initialize(){
        B = new int[8][8];
        for(int i=0; i<3;i++){
            for(int j=0; j<8; j++){
                if ((i+j)%2==0)
                    B[i][j]=1;
            }
        }
        for(int i=5; i<8;i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0){
                    B[i][j] = 2;
            }}}
    return B;
    }
    public int PieceValue(int coordinate1, int coordinate2){
        return B[coordinate1][coordinate2];

    }
}
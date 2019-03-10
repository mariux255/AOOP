public class Board {
    public void Status(int[][] B){
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }

}

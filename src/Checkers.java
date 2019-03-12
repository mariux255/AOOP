public class Checkers {
    public static void main(String[] args){
        CoordinationInterface c = new Coordination();
        int coordinatey1;
        int[] coordinates;
        int Player=0;
        int[][] board=c.initialize();
        while (true) {
            Player = ((Player%2 == 0) ? 1 : 2);
            BoardInterface b = new Board();
            b.Status(board);
            PlayerInterface p = new Player();
            while (true){
                p.pieceselect(Player);
                coordinates= p.getpieceselect();
                int coordinatex1=coordinates[0];
                coordinatey1=coordinates[1];
                if(c.PieceValue(coordinatex1,coordinatey1)==Player){
                    System.out.print(Player);

                    break;
                }

            }
            while (true){
                p.pieceselect(Player);
                int[] coordinates2=p.getpieceselect();
                int coordinatex2=coordinates2[0];
                int coordinatey2=coordinates2[1];
                PieceInterface pi = new Piece();
                if(pi.piecemove(coordinatey1,coordinatey2,c.PieceValue(coordinatex2,coordinatey2),Player)){
                    p.moveinit(board,coordinates, coordinates2);
                    break;
                }
            }
            Player=Player+1;
        }
    }
}

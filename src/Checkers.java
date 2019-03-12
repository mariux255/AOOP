public class Checkers {
    public static void main(String[] args){
        CoordinationInterface c = new Coordination();
        int coordinatey1;

        int Player=0;
        int[][] board=c.initialize();
        while (true) {
            Player = ((Player%2 == 0) ? 2 : 1);
            Board b = new Board();
            b.Status(board);
            Player p = new Player();
            while (true){
                p.pieceselect(Player);
                int[] coordinates= p.getpieceselect();
                int coordinatex1=coordinates[0];
                coordinatey1=coordinates[1];
                if(c.PieceValue(coordinatex1,coordinatey1)==Player){
                    break;
                }

            }
            while (true){
                p.pieceselect(Player);
                int[] coordinates2=p.getpieceselect();
                int coordinatex2=coordinates2[0];
                int coordinatey2=coordinates2[1];
                Piece pi = new Piece();
                if(pi.piecemove(coordinatey1,coordinatey2,c.PieceValue(coordinatex2,coordinatey2),Player)){
                    break;
                }
            }





        }


    }
}

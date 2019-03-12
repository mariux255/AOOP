public class Checkers {
    public static void main(String[] args){
        Coordination c = new Coordination();
        int Player=0;
        int[][] board=c.initialize();
        while (true) {
            Player = ((Player%2 == 0) ? 2 : 1);
            Board b = new Board();
            b.Status(board);

        }


    }
}

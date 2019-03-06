import java.util.Scanner;

/**
 * Created by owner on 11/02/2019.
 */
public class Assignment1 {
    public static void main(String[] args) {
        char[][] board = {{' ','1',' ','1',' ','1',' ','1'},
                          {'1',' ','1',' ','1',' ','1',' '},
                          {' ','1',' ','1',' ','1',' ','1'},
                          {' ',' ',' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' ',' ',' '},
                          {'2',' ','2',' ','2',' ','2',' '},
                          {' ','2',' ','2',' ','2',' ','2'},
                          {'2',' ','2',' ','2',' ','2',' '}};
        int counter = 1;

        while (true) {
            counter += 1;

            System.out.print("   ");
            for (int i = 0; i < board.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.print("  +----------------+");
            System.out.println();
            for (int i = 0; i < board.length; i++) {
                System.out.print(i + " |");
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println("  +----------------+");

            Scanner input = new Scanner(System.in);
            int playerno = counter % 2 + 1;
            int xvalpiece = 1;
            int yvalpiece = 2;
            while(true) {
                System.out.println("Player " + playerno + "'s turn");
                System.out.println("Coordinate of piece to move");
                System.out.print("Enter X value:");
                xvalpiece = input.nextInt();

                System.out.print("Enter Y value:");
                yvalpiece = input.nextInt();

                if (board[yvalpiece][xvalpiece] == (char)(playerno + 48)){
                    break;
                }
                System.out.println("Invalid piece selection please try again");
                System.out.println();
            }
            int xvalmove = 0;
            int yvalmove = 0;
            while(true) {
                boolean loopbreaker = true;
                System.out.println("Coordinate of new position");
                System.out.print("Enter X value:");
                xvalmove = input.nextInt();

                System.out.print("Enter Y value:");
                yvalmove = input.nextInt();

                if (playerno == 1){
                if (board[yvalmove][xvalmove] != ' '){System.out.println("Selected Space is occupied");}
                if ((xvalmove != xvalpiece + 1 && xvalmove != xvalpiece - 1) || (yvalmove != yvalpiece + 1)) {
                    System.out.println("Piece must move diagonally forwards by one space");
                    loopbreaker = false;}}

                if (playerno == 2){
                    if (board[yvalmove][xvalmove] != ' '){System.out.println("Selected Space is occupied");}
                    if ((xvalmove != xvalpiece + 1 && xvalmove != xvalpiece - 1) || yvalmove != yvalpiece - 1) {
                        System.out.println("Piece must move diagonally forwards by one space");
                        loopbreaker = false;}}
                if (loopbreaker) {break;}
            }

            board[yvalpiece][xvalpiece] = ' ';
            board[yvalmove][xvalmove] = (char)(playerno + 48);
        }
    }
}

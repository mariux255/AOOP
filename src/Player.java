import java.util.Scanner;

public class Player{
    private int[] coord1;
    private int playerno;
    Player(int number){
        this.playerno = number;
    }

    public void pieceselect(){
        Scanner input = new Scanner(System.in);
        System.out.println("Player " + playerno + "'s turn");
        System.out.println("Coordinate of piece to move");
        System.out.print("Enter X value:");
        int xvalpiece = input.nextInt();
        System.out.print("Enter Y value:");
        int yvalpiece = input.nextInt();
        coord1 = new int[]{xvalpiece,yvalpiece};
    }
    public int[] getpieceselect(){
        return coord1;
    }

    public void moveinit(int[][] b, int[] coord1, int[] coord2){
    b[coord2[0]][coord2[1]]=b[coord1[0]][coord1[1]];
        b[coord1[0]][coord1[1]] = 0;
    }

}
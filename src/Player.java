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

}
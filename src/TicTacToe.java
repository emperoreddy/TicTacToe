import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = scan.nextLine();
        // convert String to char array

        System.out.println("---------"); // upper grid

        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " "
                + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " "
                + input.charAt(5) + " |");
        System.out.println("| " + input.charAt(6) + " " + input.charAt(7) + " "
                + input.charAt(8) + " |");


        System.out.println("---------"); // lower grid
    }
}


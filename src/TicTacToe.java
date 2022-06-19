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

        int sumOfX = 0;
        int sumOfO = 0;
        // first row
        for (int i = 0; i < 8; i++) {
            if (input.charAt(i) == 'X') {
                sumOfX += input.charAt(i);
            } else if (input.charAt(i) == 'O') {
                sumOfO += input.charAt(i);
            }


            if (sumOfO == 237) {
                System.out.println("---------"); // lower grid
                System.out.println("O wins");
                return;
            } else if (sumOfX == 264) {
                System.out.println("---------"); // lower grid
                System.out.println("X wins");
                return;
            }

        }


    }
}


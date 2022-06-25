import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String origInput = scanner.next();
        String input = origInput.replace('_', ' ');

        String first = input.substring(0, 3);
        String second = input.substring(3, 6);
        String third = input.substring(6, 9);

        char[][] arr = new char[3][3];

        arr[0] = first.toCharArray();
        arr[1] = second.toCharArray();
        arr[2] = third.toCharArray();

        displayArray(arr);

        boolean errorDetected = false;

        do {
            try {
                System.out.print("Enter the coordinates : ");
                int r = scanner.nextInt() - 1;
                int c = scanner.nextInt() - 1;

                if (arr[r][c] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    errorDetected = true;
                }
                else {
                    errorDetected = false;
                    arr[r][c] = 'X';

                    displayArray(arr);
                }
            }
            catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                errorDetected = true;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Coordinates should be from 1 to 3!");
                errorDetected = true;
            }
        }
        while (errorDetected);

        scanner.close();

    }

    private static void displayArray(char[][] array) {
        System.out.println("---------");
        System.out.println("| " + array[0][0] + " " + array[0][1] + " "  + array[0][2] + " |");
        System.out.println("| " + array[1][0] + " " + array[1][1] + " "  + array[1][2] + " |");
        System.out.println("| " + array[2][0] + " " + array[2][1] + " "  + array[2][2] + " |");
        System.out.println("---------");
    }
}
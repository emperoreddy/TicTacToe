import java.util.Scanner;

public class Main {
    private static int countChar(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }

        return count;
    }

    private static boolean line(char c, String str, int position1, int position2, int position3) {
        char char1 = str.charAt(position1);
        char char2 = str.charAt(position2);
        char char3 = str.charAt(position3);

        return (char1 == c && char2 == c && char3 == c);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String enter = scanner.next();
        int numberO = countChar(enter, 'O');
        int numberX = countChar(enter, 'X');
        int delta = Math.abs(numberX - numberO);

        System.out.println("---------");
        System.out.println("| " + enter.charAt(0) + " " + enter.charAt(1) + " " + enter.charAt(2) + " |");
        System.out.println("| " + enter.charAt(3) + " " + enter.charAt(4) + " " + enter.charAt(5) + " |");
        System.out.println("| " + enter.charAt(6) + " " + enter.charAt(7) + " " + enter.charAt(8) + " |");
        System.out.println("---------");

        int sum = numberO + numberX;
        boolean Xwin = line('X', enter, 0, 1, 2) ||
                line('X', enter, 3, 4, 5) ||
                line('X', enter, 6, 7, 8) ||
                line('X', enter, 0, 3, 6) ||
                line('X', enter, 1, 4, 7) ||
                line('X', enter, 2, 5, 8) ||
                line('X', enter, 0, 4, 8) ||
                line('X', enter, 2, 4, 6);

        boolean Owin = line('O', enter, 0, 1, 2) ||
                line('O', enter, 3, 4, 5) ||
                line('O', enter, 6, 7, 8) ||
                line('O', enter, 0, 3, 6) ||
                line('O', enter, 1, 4, 7) ||
                line('O', enter, 2, 5, 8) ||
                line('O', enter, 0, 4, 8) ||
                line('O', enter, 2, 4, 6);

        if (Xwin && Owin || (delta > 1)) {
            System.out.println("Impossible");
        } else if (Owin) {
            System.out.println("O wins");
        } else if (Xwin) {
            System.out.println("X wins");
        } else if (sum != 9) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
        scanner.close();
    }

}
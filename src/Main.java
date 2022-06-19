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

    private static void printBoard(String defaultBoard) {
        System.out.println("---------");
        System.out.println("| " + defaultBoard.charAt(0) + " " + defaultBoard.charAt(1) + " " + defaultBoard.charAt(2) + " |");
        System.out.println("| " + defaultBoard.charAt(3) + " " + defaultBoard.charAt(4) + " " + defaultBoard.charAt(5) + " |");
        System.out.println("| " + defaultBoard.charAt(6) + " " + defaultBoard.charAt(7) + " " + defaultBoard.charAt(8) + " |");
        System.out.println("---------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String defaultBoard = scanner.next();
        int numberO = countChar(defaultBoard, 'O');
        int numberX = countChar(defaultBoard, 'X');
        int delta = Math.abs(numberX - numberO);

        printBoard(defaultBoard);

        System.out.println("Enter the coordinates: ");
        int coord1 = scanner.nextInt();
        int coord2 = scanner.nextInt();

        StringBuilder newBoard = new StringBuilder(defaultBoard);

        boolean again = true;
//        while (again) {
//            again = false;

            switch (coord1) { //placing X on given coordinates
                case 1:
                    switch (coord2) {
                        case 1:
                            if (newBoard.charAt(0) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(0, 'X');
                                break;
                            }

                        case 2:
                            if (newBoard.charAt(1) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(1, 'X');
                            }
                            break;
                        case 3:
                            if (newBoard.charAt(2) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(2, 'X');
                            }
                            break;
                        default:
                            System.out.println("Coordinates should be from 1 to 3!");
                            coord1 = scanner.nextInt();
                            coord2 = scanner.nextInt();
                            again = true;
                            break;
                    }
                case 2:
                    switch (coord2) {
                        case 1:
                            if (newBoard.charAt(3) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(3, 'X');
                            }
                            break;
                        case 2:
                            if (newBoard.charAt(4) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(4, 'X');
                            }
                            break;
                        case 3:
                            if (newBoard.charAt(5) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(5, 'X');
                            }
                            break;
                        default:
                            System.out.println("Coordinates should be from 1 to 3!");
                            coord1 = scanner.nextInt();
                            coord2 = scanner.nextInt();
                            again = true;
                            break;
                    }
                case 3:
                    switch (coord2) {
                        case 1:
                            if (newBoard.charAt(6) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(6, 'X');
                            }
                            break;
                        case 2:
                            if (newBoard.charAt(7) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(7, 'X');
                            }
                            break;
                        case 3:
                            if (newBoard.charAt(8) != '_') {
                                System.out.println("This cell is occupied! Choose another one!");
                                coord1 = scanner.nextInt();
                                coord2 = scanner.nextInt();
                                again = true;
                            } else {
                                newBoard.setCharAt(8, 'X');
                            }
                            break;
                        default:
                            System.out.println("Coordinates should be from 1 to 3!");
                            coord1 = scanner.nextInt();
                            coord2 = scanner.nextInt();
                            again = true;
                            break;
                    }
                    System.out.println("Coordinates should be from 1 to 3!");
                    coord1 = scanner.nextInt();
                    coord2 = scanner.nextInt();
                    again = true;
                    break;
            }
//        }

        printBoard(String.valueOf(newBoard));

        int sum = numberO + numberX;
        boolean Xwin = line('X', defaultBoard, 0, 1, 2) ||
                line('X', defaultBoard, 3, 4, 5) ||
                line('X', defaultBoard, 6, 7, 8) ||
                line('X', defaultBoard, 0, 3, 6) ||
                line('X', defaultBoard, 1, 4, 7) ||
                line('X', defaultBoard, 2, 5, 8) ||
                line('X', defaultBoard, 0, 4, 8) ||
                line('X', defaultBoard, 2, 4, 6);

        boolean Owin = line('O', defaultBoard, 0, 1, 2) ||
                line('O', defaultBoard, 3, 4, 5) ||
                line('O', defaultBoard, 6, 7, 8) ||
                line('O', defaultBoard, 0, 3, 6) ||
                line('O', defaultBoard, 1, 4, 7) ||
                line('O', defaultBoard, 2, 5, 8) ||
                line('O', defaultBoard, 0, 4, 8) ||
                line('O', defaultBoard, 2, 4, 6);

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
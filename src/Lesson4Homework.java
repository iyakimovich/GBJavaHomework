import java.util.Random;
import java.util.Scanner;

public class Lesson4Homework {

    public static final char CHAR_X = 'X';
    public static final char CHAR_0 = '0';
    public static final char CHAR_EMPTY = '_';

    public static final int FIELD_SIZE = 5;
    public static final int WIN_ROW_SIZE = 4;

    public static final char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    //set initial filed
    public static void setEmptyField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = CHAR_EMPTY;
            }
        }
    }

    //print field
    public static void printField() {
        for (int i = 0; i <= FIELD_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    //check if turn is valid
    public static boolean isValidTurn(int i, int j) {
        return (i >= 1) && (i <= FIELD_SIZE) && (j >= 1) && (j <= FIELD_SIZE) && (field[i-1][j-1] == CHAR_EMPTY);
    }

    //human turn - reading from console
    public static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        do {
            System.out.print("Ваш ход: ");
            j = scanner.nextInt();
            i = scanner.nextInt();
        } while (!isValidTurn(i,j));

        field[i-1][j-1] = CHAR_X;
    }

    //computer turn - random
    public static void computerTurn() {
        Random random = new Random();
        int i;
        int j;
        do {
            j = random.nextInt(FIELD_SIZE) + 1;
            i = random.nextInt(FIELD_SIZE) + 1;
        } while (!isValidTurn(i,j));

        field[i-1][j-1] = CHAR_0;
    }

    //check if the last turn with X or 0 finishes the game
    public static boolean checkForWin(char c) {

        //check win in rows
        for (int i=0; i < FIELD_SIZE; i++) {
            int winRowSize = 0;
            for (int j=0; j < FIELD_SIZE; j++) {
                if (field[i][j] == c) {
                    winRowSize++;
                    if (winRowSize == WIN_ROW_SIZE) {
                        //win in a row
                        return true;
                    }
                } else {
                    winRowSize = 0;
                }
            }
        }

        //check win in columns
        for (int j=0; j < FIELD_SIZE; j++) {
            int winColumnSize = 0;
            for (int i=0; i < FIELD_SIZE; i++) {
                if (field[i][j] == c) {
                    winColumnSize++;
                    if (winColumnSize == WIN_ROW_SIZE) {
                        //win in a column
                        return true;
                    }
                } else {
                    winColumnSize = 0;
                }
            }
        }

        //check win in diagonals
        int winMainDiagonalSize = 0;
        int winSecondDiagonalSize = 0;
        for (int i=0; i < FIELD_SIZE; i++){
            if(field[i][i] == c){
                winMainDiagonalSize++;
                if (winMainDiagonalSize == WIN_ROW_SIZE) {
                    //win in a main diagonal
                    return true;
                }
            } else {
                winMainDiagonalSize = 0;
            }

            if(field[i][FIELD_SIZE-i-1] == c) {
                winSecondDiagonalSize++;
                if (winSecondDiagonalSize == WIN_ROW_SIZE) {
                    //win in a second diagonal
                    return true;
                }

            } else {
                winSecondDiagonalSize = 0;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        setEmptyField();
        printField();

        int turnNumber =0 ;
        int lastTurnNumber = FIELD_SIZE * FIELD_SIZE;

        do {
            turnNumber++;
            if (turnNumber > lastTurnNumber) {
                System.out.println("Ничья! Больще ходов нет!");
                break;
            }

            humanTurn();
            printField();

            if (checkForWin(CHAR_X)) {
                System.out.println("Человек победил!");
                break;
            }

            computerTurn();
            printField();

            turnNumber++;
            if (turnNumber > lastTurnNumber) {
                System.out.println("Ничья! Больще ходов нет!");
                break;
            }

            if (checkForWin(CHAR_0)) {
                System.out.println("Компьютер победил!");
                break;
            }

        } while (true);

    }

}

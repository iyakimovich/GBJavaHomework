import java.util.Arrays;

public class Lesson3Homework {
    public static void main(String[] args) {

        //Задача №1
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int length = myArray.length;

        printTask(1);
        printArray(myArray);
        for (int i = 0; i < length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
        printArray(myArray);

        //Задача №2
        int[] myArray2 = new int[100];
        length = myArray2.length;

        printTask(2);
        for (int i = 0; i < length; i++) {
            myArray2[i] = i+1;
        }
        printArray(myArray2);

        //Задача №3
        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        length = myArray3.length;

        printTask(3);
        printArray(myArray3);
        for (int i = 0; i < length; i++) {
            if (myArray3[i] < 6) {
                myArray3[i] = myArray3[i] * 2;
            }
        }
        printArray(myArray3);

        //Задача №4
        int n = 11;
        int[][] myArray4 = new int[n][n];

        printTask(4);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1)) {
                    myArray4[i][j] = 1;
                }
            }
        }
        printArray2(myArray4);

        //Задача №5
        int len = 15;
        int initialValue = 3;
        int[] myArray5 = getArray(len, initialValue);

        printTask(5);
        printArray(myArray5);

        //Задача №6
        int[] myArray6 = {1, 5, 3, 2, 11, 4, 5, -2, 4, 8, 9, 1, 20, 5};
        length = myArray6.length;

        printTask(6);
        printArray(myArray6);

        int min = myArray6[0];
        int max = myArray6[0];

        for (int i = 0; i < length; i++) {
            if (myArray6[i] < min) {
                min = myArray6[i];
            }
            if (myArray6[i] > max) {
                max = myArray6[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        //Задача №7
        printTask(7);

        int[] myArray7 = {2, 2, 2, 1, 2, 2, 10, 1};

        printArray(myArray7);
        if (chekBalance(myArray7)) {
            System.out.println("Yes, there is a balance");
        } else {
            System.out.println("No, there is no balance");
        }

        //Задача №8
        printTask(8);

        int[] myArray8 = {1, 2, 3, 4, 5, 6, 7, 8};

        printArray(myArray8);
        shfitArrayLeft(myArray8);
        printArray(myArray8);
        shfitArrayRight(myArray8);
        printArray(myArray8);

        shfitArray(myArray8, 3);
        printArray(myArray8);

        shfitArray(myArray8, -3);
        printArray(myArray8);

    }

    // function for Task #5
    public static int[] getArray(int len, int initialValue) {
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = initialValue;
        }

        return result;
    }

    // prints one dimension array
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // prints two dimension array
    public static void printArray2(int[][] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    // prints task #
    public static void printTask(int taskNum) {
        System.out.println("Задача №" + taskNum);
    }

    //Task #7
    public static boolean chekBalance(int[] array) {
        int sumLeft = 0;
        int sumRight = 0;
        int length = array.length;

        // Get sum of all
        for( int i = 0; i < length; i++) {
            sumRight = sumRight + array[i];
        }

        for( int i = 0; i < length; i++) {
            sumLeft = sumLeft + array[i];
            sumRight = sumRight - array[i];

            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    //Task #8
    public static void shfitArrayLeft(int[] array) {
        int length = array.length;
        int firstItem = array[0];

        for(int i=0; i < length-1; i++) {
            array[i] = array[i+1];
        }

        array[length-1] = firstItem;
    }

    public static void shfitArrayRight(int[] array) {
        int length = array.length;
        int lastItem = array[length-1];

        for(int i = length-1; i > 0; i--) {
            array[i] = array[i-1];
        }

        array[0] = lastItem;
    }

    public static void shfitArray(int[] array, int shiftSize) {
        if (shiftSize > 0) {
            for(int i = 0; i < shiftSize; i++) {
                shfitArrayRight(array);
            }
        } else {
            for(int i = 0; i > shiftSize; i--) {
                shfitArrayLeft(array);
            }

        }

    }

}

public class Lesson2Homework {
    public static void main(String[] args) {

        // Звдача №1
        int num1 = 15;
        int num2 = 10;
        boolean isInRange = checkSumRange(num1, num2);
        System.out.println(isInRange);

        // Задача №2
        num1 = -1;
        printPositive(num1);

        // Задача №3
        num1 = -1;
        boolean isNegative = isNegative(num1);
        System.out.println(isNegative);

        // Задача №4
        printString("My string!", 5);

        // Задача №5
        int year = 2000;
        boolean result = isLeapYear(year);

        System.out.println(year);
        System.out.println(result);

        year = 2020;
        result = isLeapYear(year);
        System.out.println(year);
        System.out.println(result);

        year = 2021;
        result = isLeapYear(year);
        System.out.println(year);
        System.out.println(result);

        year = 2100;
        result = isLeapYear(year);
        System.out.println(year);
        System.out.println(result);
    }

    public static boolean checkSumRange(int num1, int num2) {
        int sum = num1 + num2;
        return (sum >= 10) && (sum <= 20);
    }

    public static void  printPositive(int num) {
        if (num >= 0) {
            System.out.println("Number is positive!");
        } else {
            System.out.println("Number is negative!");
        }

    }

    public static boolean isNegative(int num) {
        return (num < 0);
    }

    public static void printString(String str, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 4 == 0) {
            result = true;
            if ((year % 100 == 0) && (year % 400 != 0)) {
                result = false;
            }
        }
        return result;
    }
}

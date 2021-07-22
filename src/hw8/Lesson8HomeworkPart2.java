package hw8;

import java.util.Random;
import java.util.Scanner;

public class Lesson8HomeworkPart2 {
    public static void main(String[] args) {
        //Задание №2 - Игра
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int LENGTH = words.length;
        int MAX_LENGTH = 15;

        Random rnd = new Random();
        String myWord = words[rnd.nextInt(LENGTH)];
        int myWordLen = myWord.length();


        System.out.println("Слово загадано! " + myWord);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ваш вариант: ");
            String attempt = scanner.next();
            if (attempt.equals(myWord)) {
                System.out.println("Угадали!");
                break;
            }

            int attemptLen = attempt.length();
            int minLen = Integer.min(myWordLen, attemptLen);

            System.out.println("Не угадали!");
            for (int i = 0; i < MAX_LENGTH; i++) {
                if (i >= minLen) {
                    System.out.print("*");
                } else {
                    char c = myWord.charAt(i);
                    if (c == attempt.charAt(i)) {
                        System.out.print(c);
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        } while (true);
    }
}

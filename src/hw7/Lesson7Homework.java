package hw7;

import java.util.Random;

public class Lesson7Homework {

    public static int COUNT = 10;
    public static int MAX_APPETITE = 20;

    public static void main(String[] args) {
        Plate plate = new Plate(50);

        Cat[] cats = new Cat[COUNT];

        //создаем котов со случайным аппетитом
        Random random = new Random();
        for (int i = 0; i < COUNT; i++) {
            cats[i] = new Cat("Кот №" + (i+1), random.nextInt(MAX_APPETITE+1));
            cats[i].showInfo();
        }

        boolean allCatsFed = feedCats(cats, plate);

        do  {
            allCatsFed = feedCats(cats, plate);
            if (allCatsFed) {
                break;
            }
            System.out.println("Не все коты поели! Добавим еды!");
            plate.addFood(50);
            plate.showInfo();
        } while (true);
    }

    public static boolean feedCats(Cat[] cats, Plate plate) {
         //пытаемся накормить котов
         boolean allCatsFed = true;
         System.out.println();
         for (int i = 0; i < COUNT; i++) {
             Cat cat = cats[i];
             cat.eatFrom(plate);
             cat.showInfo();
             plate.showInfo();
             if (cat.isHungry) {
                 allCatsFed = false;
             }
         }
         return allCatsFed;
     }
}

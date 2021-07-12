public class Lesson6Homework {
    public static void main(String[] args) {

        //Homework #6
        Animal bird = new Animal("Птичка-синичка");
        Animal bear = new Animal("Иедведь-шатун");
        Animal dog = new Dog("Бобик");
        Animal cat = new Cat("Барсик");

        int COUNT = 4;
        Animal[ ] animals = new Animal[COUNT];
        animals[0] = bird;
        animals[1] = dog;
        animals[2] = cat;
        animals[3] = bear;

        //Running 1000m
        for (int i = 0; i < COUNT; i++) {
            run(animals[i], 1000);
        }

        //Swimming 100m
        for (int i = 0; i < COUNT; i++) {
            swim(animals[i], 100);
        }

        System.out.println("Всего животных: " + Animal.animalsCount);
        System.out.println("Всего собак: " + Dog.dogsCount);
        System.out.println("Всего котов:" + Cat.catsCount);

    }

    public static void run(Animal animal, int length) {
        animal.run(length);
    }

    public static void swim(Animal animal, int length) {
        animal.swim(length);
    }
}

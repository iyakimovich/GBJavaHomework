public class Cat extends Animal {
    public static int catsCount;

    public Cat(String name) {
        super(name, 200, 0);
        catsCount++;
    }

    //Котики не умеют плавать
    @Override
    public void swim(int length) {
        System.out.println(name + " не умеет плавать!");
    }
}

public class Dog extends Animal {
    public static int dogsCount;


    public Dog(String name) {
        super(name, 500, 10);
        dogsCount++;
    }
}

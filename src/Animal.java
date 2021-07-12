public class Animal {
    String name;
    int runLimit = Integer.MAX_VALUE;
    int swimLimit = Integer.MAX_VALUE;
    static int animalsCount;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalsCount++;
    }

    public void run(int length) {
        int l = length;
        if (l > runLimit) {
            l = runLimit;
        }
        System.out.println(name + " пробежал(а) " + l + " метров!");
    }

    public void swim(int length) {
        int l = length;
        if (l > swimLimit) {
            l = swimLimit;
        }
        System.out.println(name + " проплыл(а) " + l + " метров!");
    }

}

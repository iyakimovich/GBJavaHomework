package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean canFeed(int appetite) {
        return (food >= appetite);
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void addFood(int appetite) {
        food += appetite;
    }
    public void showInfo() {
        System.out.println("plate: " + food);
    }
}

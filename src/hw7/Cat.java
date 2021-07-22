package hw7;

public class Cat {
    private String name;
    private int appetite;

    public boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void eatFrom(Plate plate) {
        if (isHungry && plate.canFeed(appetite)) {
            plate.decreaseFood(appetite);
            isHungry = false;
        }
    }

    public void showInfo() {
        System.out.println("Кот: " + name + ", аппетит: " + appetite + ", голоден: " + isHungry);
    }
}

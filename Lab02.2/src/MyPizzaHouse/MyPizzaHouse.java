package MyPizzaHouse;

public class MyPizzaHouse {
    private void prepare() {
        System.out.println("Pizza Preparing");
    }

    private int zip;
    public MyPizzaHouse(int zip) {
        this.zip=zip;
    }

    private void addToppings() {
        System.out.println("Pizza Add Toppings");
    }

    private void bake() {
        System.out.println("Pizza Baking");
    }

    public void makePizza() {
        prepare();
        addToppings();
        bake();
    }
}

class MyPizzaHouseClient {
    public static void main(String[] args) {
        MyPizzaHouse Domino = new MyPizzaHouse(9);
        Domino.makePizza();
    }
}
package enums;

public enum ToppingType {

    CHEESE(40),
    OLIVES(30),
    MUSHROOM(35),
    JALAPENOS(25),
    PANEER(50),
    CHICKEN(70),
    PEPPERONI(80);

    private final double cost;

    ToppingType(double cost) {
        this.cost = cost;
    }

    public double cost() {
        return cost;
    }
}

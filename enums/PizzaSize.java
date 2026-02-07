package enums;

public enum PizzaSize {
    SMALL(1.0),
    MEDIUM(1.3),
    LARGE(1.6);

    private final double multiplier;

    PizzaSize(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

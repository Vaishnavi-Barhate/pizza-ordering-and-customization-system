package strategy;

public class RegularToppingStrategy implements ToppingStrategy {

    private final double toppingCost;

    public RegularToppingStrategy(double toppingCost) {
        this.toppingCost = toppingCost;
    }

    @Override
    public double addTopping(double basePrice) {
        return basePrice + toppingCost;
    }

    @Override
    public double cost() {
        return toppingCost;
    }
}

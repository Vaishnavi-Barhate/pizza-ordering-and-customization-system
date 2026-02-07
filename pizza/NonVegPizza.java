package pizza;

import enums.PizzaCategory;
import enums.PizzaSize;

public class NonVegPizza extends Pizza {

    private static final double BASE_PRICE = 250;

    public NonVegPizza(PizzaSize size) {
        super(size);
    }

    @Override
    public PizzaCategory getCategory() {
        return PizzaCategory.NON_VEG;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE * size.getMultiplier();
    }

    @Override
    public String getDescription() {
        return "Non-Veg Pizza";
    }
}

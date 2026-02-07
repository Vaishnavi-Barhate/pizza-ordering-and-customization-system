package pizza;

import enums.PizzaCategory;
import enums.PizzaSize;

public class VegPizza extends Pizza {

    private static final double BASE_PRICE = 200;

    public VegPizza(PizzaSize size) {
        super(size);
    }

    @Override
    public double getPrice() {
        return BASE_PRICE * size.getMultiplier();
    }

    @Override
    public String getDescription() {
        return "Veg Pizza";
    }

    @Override
    public PizzaCategory getCategory() {
        return PizzaCategory.VEG;
    }
}

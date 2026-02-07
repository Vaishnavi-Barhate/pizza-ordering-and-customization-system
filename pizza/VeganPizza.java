package pizza;

import enums.PizzaCategory;
import enums.PizzaSize;

public class VeganPizza extends Pizza {

    private static final double BASE_PRICE = 220;

    public VeganPizza(PizzaSize size) {
        super(size);
    }

    @Override
    public PizzaCategory getCategory() {
        return PizzaCategory.VEGAN;
    }

    @Override
    public double getPrice() {
        return BASE_PRICE * size.getMultiplier();
    }

    @Override
    public String getDescription() {
        return "Vegan Pizza";
    }
}

package pizza;

import enums.PizzaCategory;
import enums.PizzaSize;
import enums.ToppingType;

public final class NonVegPizza implements Pizza {

    private final PizzaSize size;

    public NonVegPizza(PizzaSize size) {
        this.size = size;
    }

    @Override
    public PizzaSize size() {
        return size;
    }

    @Override
    public PizzaCategory category() {
        return PizzaCategory.NON_VEG;
    }

    @Override
    public double getPrice() {
        return category().basePrice() * size.multiplier();
    }

    @Override
    public String getDescription() {
        return category().displayName() + " Pizza";
    }

    @Override
    public boolean isToppingAllowed(ToppingType topping) {
        return true; 
    }
}

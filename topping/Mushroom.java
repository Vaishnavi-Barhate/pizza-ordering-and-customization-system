package topping;

import pizza.Pizza;
import enums.PizzaCategory;

public class Mushroom extends ToppingDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 35;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    @Override
    public PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

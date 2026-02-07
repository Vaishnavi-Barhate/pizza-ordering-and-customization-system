package topping;

import pizza.Pizza;

public class Cheese extends ToppingDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public enums.PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

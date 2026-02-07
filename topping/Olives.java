package topping;

import pizza.Pizza;

public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 30;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public enums.PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

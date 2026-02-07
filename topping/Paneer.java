package topping;

import pizza.Pizza;

public class Paneer extends ToppingDecorator {

    public Paneer(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 50;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    public enums.PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

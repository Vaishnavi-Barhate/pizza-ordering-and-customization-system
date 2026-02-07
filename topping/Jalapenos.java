package topping;

import pizza.Pizza;

public class Jalapenos extends ToppingDecorator {

    public Jalapenos(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 25;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Jalapenos";
    }

    public enums.PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

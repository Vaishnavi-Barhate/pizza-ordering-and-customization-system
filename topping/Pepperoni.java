package topping;

import pizza.Pizza;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 80;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public enums.PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

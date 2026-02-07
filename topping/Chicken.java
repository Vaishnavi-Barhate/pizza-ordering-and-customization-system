package topping;

import pizza.Pizza;

public class Chicken extends ToppingDecorator {

    public Chicken(Pizza pizza) {
        super(pizza);
    }

    public double getPrice() {
        return pizza.getPrice() + 70;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    public enums.PizzaCategory getCategory() {
        return pizza.getCategory();
    }
}

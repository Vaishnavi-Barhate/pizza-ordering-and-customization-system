package topping;

import enums.PizzaCategory;
import enums.PizzaSize;
import enums.ToppingType;
import pizza.Pizza;

public final class ToppingDecorator implements Pizza {

    private final Pizza pizza;
    private final ToppingType topping;

    public ToppingDecorator(Pizza pizza, ToppingType topping) {
        this.pizza = pizza;
        this.topping = topping;
    }

    @Override
    public PizzaSize size() {
        return pizza.size();
    }

    @Override
    public PizzaCategory category() {
        return pizza.category();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + topping.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", " + topping.name();
    }

    @Override
    public boolean isToppingAllowed(ToppingType topping) {
        return pizza.isToppingAllowed(topping);
    }
}

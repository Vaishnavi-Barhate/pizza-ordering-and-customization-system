package topping;

import pizza.Pizza;

public abstract class ToppingDecorator extends Pizza {

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        super(pizza.getSize());
        this.pizza = pizza;
    }
}

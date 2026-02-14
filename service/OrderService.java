package service;

import enums.ToppingType;
import pizza.Pizza;
import topping.ToppingDecorator;

public final class OrderService {

    public static Pizza addTopping(Pizza pizza, ToppingType topping) {

        if (!pizza.isToppingAllowed(topping)) {
            throw new IllegalArgumentException(
                    "Topping " + topping + " is not allowed for " + pizza.category()
            );
        }

        return new ToppingDecorator(pizza, topping);
    }
}

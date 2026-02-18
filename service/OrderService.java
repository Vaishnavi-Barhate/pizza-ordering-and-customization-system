package service;

import enums.ToppingType;
import pizza.Pizza;
import strategy.RegularToppingStrategy;
import strategy.ToppingStrategy;

public final class OrderService {

    private OrderService() {}

    public static Pizza applyToppings(Pizza pizza,
                                      ToppingType[] toppings) {

        double finalPrice = pizza.getPrice();
        StringBuilder description =
                new StringBuilder(pizza.getDescription());

        for (int i = 0; i < toppings.length; i++) {

            if (toppings[i] == null)
                break;

            ToppingType topping = toppings[i];

            if (!pizza.isToppingAllowed(topping)) {
                System.out.println("Skipping not allowed topping: " + topping);
                continue;
            }

            ToppingStrategy strategy =
                    new RegularToppingStrategy(topping.cost());

            finalPrice = strategy.addTopping(finalPrice);

            description.append(", ").append(topping.name());
        }

        double resultPrice = finalPrice;

        return new Pizza() {

            @Override
            public enums.PizzaSize size() {
                return pizza.size();
            }

            @Override
            public enums.PizzaCategory category() {
                return pizza.category();
            }

            @Override
            public double getPrice() {
                return resultPrice;
            }

            @Override
            public String getDescription() {
                return description.toString();
            }

            @Override
            public boolean isToppingAllowed(ToppingType topping) {
                return pizza.isToppingAllowed(topping);
            }
        };
    }
}

package service;

import enums.PizzaCategory;
import enums.ToppingType;
import pizza.Pizza;
import topping.*;

public class OrderService {

    public static boolean isToppingAllowed(PizzaCategory category, ToppingType topping) {
        return switch (category) {
            case VEG -> topping != ToppingType.CHICKEN && topping != ToppingType.PEPPERONI;
            case VEGAN -> topping == ToppingType.OLIVES
                        || topping == ToppingType.MUSHROOM
                        || topping == ToppingType.JALAPENOS;
            case NON_VEG -> true;
        };
    }

    public static Pizza addTopping(Pizza pizza, ToppingType topping) {
        return switch (topping) {
            case CHEESE -> new Cheese(pizza);
            case OLIVES -> new Olives(pizza);
            case MUSHROOM -> new Mushroom(pizza);
            case JALAPENOS -> new Jalapenos(pizza);
            case PANEER -> new Paneer(pizza);
            case CHICKEN -> new Chicken(pizza);
            case PEPPERONI -> new Pepperoni(pizza);
        };
    }
}

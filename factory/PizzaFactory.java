package factory;

import enums.PizzaCategory;
import enums.PizzaSize;
import pizza.*;

public class PizzaFactory {

    public static Pizza createPizza(PizzaCategory category, PizzaSize size) {
        return switch (category) {
            case VEG -> new VegPizza(size);
            case NON_VEG -> new NonVegPizza(size);
            case VEGAN -> new VeganPizza(size);
        };
    }
}

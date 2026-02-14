package factory;

import enums.PizzaCategory;
import enums.PizzaSize;
import java.util.Map;
import java.util.function.Function;
import pizza.*;

public final class PizzaFactory {

    private static final Map<PizzaCategory, Function<PizzaSize, Pizza>> PIZZA_CREATORS =
            Map.of(
                    PizzaCategory.VEG, VegPizza::new,
                    PizzaCategory.NON_VEG, NonVegPizza::new,
                    PizzaCategory.VEGAN, VeganPizza::new
            );

    public static Pizza createPizza(PizzaCategory category, PizzaSize size) {

        Function<PizzaSize, Pizza> creator = PIZZA_CREATORS.get(category);

        if (creator == null) {
            throw new IllegalArgumentException("Invalid pizza category");
        }

        return creator.apply(size);
    }
}

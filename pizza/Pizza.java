package pizza;

import enums.PizzaCategory;
import enums.PizzaSize;
import enums.ToppingType;

public interface Pizza {

    PizzaSize size();

    PizzaCategory category();

    double getPrice();

    String getDescription();

    boolean isToppingAllowed(ToppingType topping);
}

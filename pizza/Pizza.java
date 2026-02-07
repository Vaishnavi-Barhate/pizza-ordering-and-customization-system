package pizza;

import enums.PizzaCategory;
import enums.PizzaSize;

public abstract class Pizza {

    protected PizzaSize size;

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    public PizzaSize getSize() {
        return size;
    }

    public abstract double getPrice();
    public abstract String getDescription();
    public abstract PizzaCategory getCategory();
}

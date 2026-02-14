package enums;

public enum PizzaCategory {

    VEG("Veg", 200),
    NON_VEG("Non-Veg", 250),
    VEGAN("Vegan", 220);

    private final String displayName;
    private final double basePrice;

    PizzaCategory(String displayName, double basePrice) {
        this.displayName = displayName;
        this.basePrice = basePrice;
    }

    public String displayName() {
        return displayName;
    }

    public double basePrice() {
        return basePrice;
    }
}

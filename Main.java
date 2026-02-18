import enums.PizzaCategory;
import enums.PizzaSize;
import enums.ToppingType;
import factory.PizzaFactory;
import java.util.Scanner;
import pizza.Pizza;
import service.OrderService;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Pizza Ordering System");

        PizzaCategory category = selectCategory();
        PizzaSize size = selectSize();

        Pizza pizza = PizzaFactory.createPizza(category, size);

        ToppingType[] selectedToppings = collectToppings();

        pizza = OrderService.applyToppings(pizza, selectedToppings);

        displaySummary(pizza);
    }

    private static PizzaCategory selectCategory() {
        System.out.println("\nSelect Pizza Category:");
        printOptions(PizzaCategory.values());

        int choice = readChoice(1, PizzaCategory.values().length);
        return PizzaCategory.values()[choice - 1];
    }

    private static PizzaSize selectSize() {
        System.out.println("\nSelect Pizza Size:");
        printOptions(PizzaSize.values());

        int choice = readChoice(1, PizzaSize.values().length);
        return PizzaSize.values()[choice - 1];
    }

    private static ToppingType[] collectToppings() {

        ToppingType[] toppings = new ToppingType[10]; 
        int count = 0;

        while (true) {

            System.out.println("\nAdd Topping?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int choice = readChoice(1, 2);
            if (choice == 2) break;

            System.out.println("\nAvailable Toppings:");
            printOptions(ToppingType.values());

            int toppingChoice =
                    readChoice(1, ToppingType.values().length);

            ToppingType selected =
                    ToppingType.values()[toppingChoice - 1];

            toppings[count++] = selected;

            System.out.println("Selected: " + selected);
        }

        return toppings;
    }

    private static void displaySummary(Pizza pizza) {
        System.out.println("\n ORDER SUMMARY");
        System.out.println("Category : " + pizza.category());
        System.out.println("Size     : " + pizza.size());
        System.out.println("Details  : " + pizza.getDescription());
        System.out.println("Total ₹  : " + pizza.getPrice());
    }

    private static int readChoice(int min, int max) {

        while (true) {
            try {
                int input = Integer.parseInt(scanner.next());
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Enter number between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }
    }

    private static <T> void printOptions(T[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}

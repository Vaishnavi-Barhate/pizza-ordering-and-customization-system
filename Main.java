import enums.*;
import factory.PizzaFactory;
import java.util.Scanner;
import pizza.Pizza;
import service.OrderService;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Pizza Category:");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println("3. Vegan");
        PizzaCategory category = PizzaCategory.values()[sc.nextInt() - 1];

        System.out.println("\nSelect Pizza Size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        PizzaSize size = PizzaSize.values()[sc.nextInt() - 1];

        Pizza pizza = PizzaFactory.createPizza(category, size);

        while (true) {
            System.out.println("\nDo you want to add a topping?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = sc.nextInt();
            if (choice == 2) break;

            System.out.println("\nChoose Topping:");
            ToppingType[] toppings = ToppingType.values();
            for (int i = 0; i < toppings.length; i++) {
                System.out.println((i + 1) + ". " + toppings[i]);
            }

            ToppingType selected = toppings[sc.nextInt() - 1];

            if (!OrderService.isToppingAllowed(category, selected)) {
                System.out.println("This topping is not allowed for selected pizza type");
                continue;
            }

            pizza = OrderService.addTopping(pizza, selected);
        }

        System.out.println("\nORDER SUMMARY");
        System.out.println("Category : " + pizza.getCategory());
        System.out.println("Size     : " + pizza.getSize());
        System.out.println("Toppings : " + pizza.getDescription());
        System.out.println("Total ₹  : " + pizza.getPrice());

        sc.close();
    }
}

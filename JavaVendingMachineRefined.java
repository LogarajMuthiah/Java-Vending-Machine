package Basics;
import java.util.Scanner;

public class JavaVendingMachineRefined {
    String[] items = {
        "Egg puffs - ₹20",
        "Tea - ₹15",
        "Coffee - ₹20",
        "Badam Milk - ₹35",
        "Milk Kova - ₹30"
    };

    int[] prices = {20, 15, 20, 35, 30}; // Parallel array for prices
    Scanner sc = new Scanner(System.in);
    int totalBill = 0; // Track total spent by user

    // Displays the menu
    void showMenu() {
        System.out.println("\n=== Welcome to Ags Health ===");
        System.out.println("Today's Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
        System.out.println("0. Exit");
        System.out.println();
    }

    // Reads the user’s selected option
    int getInput() {
        System.out.print("Select option to buy the product: ");
        return sc.nextInt();
    }

    // Confirms user's choice
    boolean confirm(String message) {
        System.out.print(message + " (Yes/No): ");
        String input = sc.next();
        return input.equalsIgnoreCase("Yes");
    }

    // Handles a single purchase
    void handlePurchase(int option) {
        if (option > 0 && option <= items.length) {
            System.out.println("\nYou selected: " + items[option - 1]);
            boolean buy = confirm("Do you want to buy this item?");
            if (buy) {
                totalBill += prices[option - 1];
                System.out.println("✅ Item added! Current total: ₹" + totalBill);
            } else {
                System.out.println("❌ Item skipped.");
            }
        } else {
            System.out.println("⚠️ Invalid option, please try again.");
        }
    }

    // Main vending machine loop
    void run() {
        while (true) {
            showMenu();
            int selectedOption = getInput();

            if (selectedOption == 0) {
                System.out.println("\nFinal Bill: ₹" + totalBill);
                System.out.println("Thank you for shopping with us!");
                break;
            }

            handlePurchase(selectedOption);

            boolean buyMore = confirm("Do you want to buy another item?");
            if (!buyMore) {
                System.out.println("\nFinal Bill: ₹" + totalBill);
                System.out.println("Thank you for shopping with us!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        JavaVendingMachineRefined machine = new JavaVendingMachineRefined();
        machine.run();
    }
}

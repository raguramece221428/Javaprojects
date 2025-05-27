package raguram;
import java.util.Scanner;


import java.util.HashMap;
import java.util.Map;

public class Supermarket {
private static final Map<String, Double> cart = new HashMap<>();
 private static final Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
 while (true) {
		            System.out.println("\nShopping Cart Menu:");
		            System.out.println("1. Add item");
		            System.out.println("2. Remove item");
		            System.out.println("3. View cart");
		            System.out.println("4. Checkout");
		            System.out.println("5. Exit");
		            System.out.print("Choose an option: ");
		            
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    addItem();
		                    break;
		                case 2:
		                    removeItem();
		                    break;
		                case 3:
		                    viewCart();
		                    break;
		                case 4:
		                    checkout();
		                    break;
		                case 5:
		                    System.out.println("Thank you for shopping! Goodbye!");
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		    }

		    private static void addItem() {
		        System.out.print("Enter item name: ");
		        String item = scanner.nextLine();
		        System.out.print("Enter item price: ");
		        double price = scanner.nextDouble();
		        scanner.nextLine(); // Consume newline
		        cart.put(item, cart.getOrDefault(item, 0.0) + price);
		        System.out.println(item + " added to cart.");
		    }

		    private static void removeItem() {
		        System.out.print("Enter item name to remove: ");
		        String item = scanner.nextLine();
		        if (cart.containsKey(item)) {
		            cart.remove(item);
		            System.out.println(item + " removed from cart.");
		        } else {
		            System.out.println("Item not found in cart.");
		        }
		    }

		    private static void viewCart() {
		        if (cart.isEmpty()) {
		            System.out.println("Your cart is empty.");
		        } else {
		            System.out.println("\nShopping Cart:");
		            double total = 0;
		            for (Map.Entry<String, Double> entry : cart.entrySet()) {
		                System.out.println(entry.getKey() + " - RS." + entry.getValue());
		                total += entry.getValue();
		            }
		            System.out.println("Total: RS." + total);
		        }
		    }

		    private static void checkout() {
		        if (cart.isEmpty()) {
		            System.out.println("Your cart is empty. Add items before checkout.");
		        } else {
		            viewCart();
		            System.out.println("Proceeding to checkout...");
		            cart.clear();
		            System.out.println("Checkout complete. Your cart is now empty.");
		        }
		    }
		
	}



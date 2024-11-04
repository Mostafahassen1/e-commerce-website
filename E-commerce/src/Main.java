import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();
        CartManager cartManager = new CartManager(productManager ,customerManager ) ;
        productManager.addProduct(new Product("Laptop", 1200.0, 5, null, null));
        productManager.addProduct(new Product("Milk", 2.5, 10, null, LocalDate.now().plusDays(5)));
        productManager.addProduct(new Product("Rice", 20.0, 2, 5.0, null));
        productManager.addProduct(new Product("Cheese", 3.0, 5, null, LocalDate.now().minusDays(1)));

        // productManager.getProducts();
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println("Choose an action:");
            System.out.println("1 - Add new Customer");
            System.out.println("2 - Buy items in the cart");
            System.out.println("3 - Print items in your cart");
            System.out.println("4 - Print all available products");
            System.out.println("5 - Delete all items from cart");
            System.out.println("6 - Add item in the cart");
            System.out.println("0 - Exit");

            System.out.println("  ");
            System.out.println("  ");
            System.out.println(" Enter Number for Action :  ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    customerManager.addCustomer();
                    break;
                case 2:
                    cartManager.buyItems();
                    break;
                  case 3:
                    cartManager.printCart();
                    break;
                  case 4:
                    productManager.getProducts();
                    break;
                case 5:
                    cartManager.clearCart();
                    break;
                case 6:
                    cartManager.AddItemInCart();
                    break;
                case 0:
                    running = false;
                    break;
               default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
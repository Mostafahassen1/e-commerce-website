import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartManager {

    private List<CartItem> items;
    private ProductManager productManager ;
    private  Scanner scanner = new Scanner(System.in);
    private CartManager cartManager ;
    private CustomerManager customerManager ;

    public CartManager(ProductManager productManager ,CustomerManager customerManager  ) {
        this.items = new ArrayList<>();
        this.productManager = productManager;
        this.customerManager = customerManager ;

    }
    public void clearCart(){
        items.clear();
        System.out.println("The list of cart is empty now ");
    }


    public void  AddItemInCart ( ){
        addProductAndCheck() ;

    }

    public void printCart(){
        Printer();
    }

    private void Printer(){
        if( items.size() == 0 )
            System.out.println(" The cart is empty ");
        else {
            for (CartItem item : items) {

                double price = productManager.getPriceItem(item.getId());

                System.out.println("Product ID: " + item.getId());
                System.out.println("Quantity: " + item.getQuantity());
                System.out.println("Price: $" + price * item.getQuantity());

                System.out.println("---------");
            }
        }
    }

    private void addProductAndCheck(){
        System.out.print("Enter the id for the item: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the quantity that you want to buy from the item: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

       // scanner.close() ;

        if (productManager.isItemAvailable(id, quantity)) {
            System.out.println("Item is available. Adding to cart...");
            items.add(new CartItem(id, quantity));


        }
        else
        {
            System.out.println("Item is not available or insufficient quantity.");
        }
    }

 public Boolean checkCustomerBalance( int id){
        double totalPrice = 0 ;
        for (CartItem item : items) {
            double price = productManager.getPriceItem(item.getId());
            totalPrice += item.getQuantity()*price ;
        }

        return customerManager.isEnoughBalanceAvailable(id , totalPrice) ;

    }
    void RemoveFromProductList(){

        for(CartItem item : items ){
            int id = item.getId() ;
            int quantity = item.getQuantity() ;
            productManager.removeItem(id , quantity) ;
        }
    }

    public void buyItems(){
        System.out.print("Enter the id for the Customer: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Boolean  checkCustomerBalance =  checkCustomerBalance(id) ;
          RemoveFromProductList() ;

          double totalPrice = 0 ;
        System.out.println("** Shipment notice **");
        for (CartItem item : items) {
            System.out.println(item.getQuantity() + "X  " + productManager.getItembyID(id));
        }
        System.out.println("------------------------");
        for (CartItem item : items) {
            System.out.println("** Checkout receipt **");
            double price = productManager.getPriceItem(item.getId());
            totalPrice += item.getQuantity()*price ;
            System.out.println(item.getQuantity() + "X  " + productManager.getItembyID(id) +"  "+ totalPrice);
        }
        System.out.println("-------------------------");
        System.out.println("Subtotal :    "+totalPrice  );
        System.out.println("Shipping       "+ 30);
        System.out.println("Amount         "+totalPrice + 30  );

        System.out.println("--------------------------------------");
        System.out.println("         ");
        System.out.println("          ");
        }



}

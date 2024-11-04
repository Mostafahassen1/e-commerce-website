import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> products;
    private  int id = 50 ;
    public ProductManager() {
        products = new ArrayList<>();
    }


    public void removeItem(int id , int quantity ){
        for (Product product : products) {
            if ( product.getId() == id) {
                product.setQuantity( product.getItemQuantity() - quantity );
            }
        }
    }

    public void addProduct(Product product) {

        product.setId(id);
        id = id +1  ;
        products.add(product);
    }

    public void  getProducts() {
        List<Product> shippableProducts = new ArrayList<>();
        for (Product product : products) {
            if (!product.isExpired() ) {
                shippableProducts.add(product);
            }
        }

        Printer(shippableProducts) ;

    }

    public String  getItembyID( int id ) {

        for (Product products : products) {
            if (products.getId() == id)
                return products.getItemName();

        }
        return "Item is not available ";
    }

    public double getPriceItem( int id){
        for (Product product : products) {
            if (product.getId() == id)
              return   product.getItemPrice() ;

            }
        return 0 ;
    }



    public boolean isItemAvailable(int id, int quantity) {

        for (Product product : products) {
            if (product.getId() == id) {

                return product.getItemQuantity() >= quantity;
            }
        }

        return false;
    }

    private void Printer( List<Product> productList) {

        for (Product product : productList) {
            System.out.println("Product ID :" + product.getId() );
            System.out.println("Product Name: " + product.getItemName());
            System.out.println("Price: $" + product.getItemPrice());
            System.out.println("Quantity: " + product.getItemQuantity());

            // Only print weight if it’s not null
            if (product.getWeight() != null) {
                System.out.println("Weight: " + product.getWeight() + " kg");
            }

            System.out.println("---------");
        }
    }

}

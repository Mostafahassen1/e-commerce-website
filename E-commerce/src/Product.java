import java.time.LocalDate;

public class Product  {
    private String name;
    private double price;
    private int quantity;
    private Double weight;       // Nullable to indicate optional attribute
    private LocalDate expiryDate; // Nullable to indicate optional attribute
    private int id ;

    public Product(String name, double price, int quantity, Double weight, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.expiryDate = expiryDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return name;
    }


    public double getItemPrice() {
        return price;
    }


    public int getItemQuantity() {
        return quantity;
    }

    public Double getWeight() {
        return weight;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    // Check if the product has expired
    public boolean isExpired() {
        return expiryDate != null && LocalDate.now().isAfter(expiryDate);
    }


    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", expiryDate=" + expiryDate +
                '}';
    }
}

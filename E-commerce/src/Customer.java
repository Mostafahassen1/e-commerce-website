

public class Customer {

    private double CurrentBalance ;
    private String name ;
    private int id ;

    public Customer(double currentBalance, String name, int id) {
        CurrentBalance = currentBalance;
        this.name = name;
        this.id = id;
    }

    public double getCurrentBalance() {
        return CurrentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        CurrentBalance = currentBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

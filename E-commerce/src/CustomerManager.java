import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {

   // private Customer customer ;
    private List<Customer> personList  ;
    private Scanner scanner = new Scanner(System.in);
    private int customerId  ;
    private double netBalance ;

    public CustomerManager() {

        customerId = 50 ;
        netBalance = 500 ;
        personList = new ArrayList<>() ;
    }

    public void addCustomer(){
        System.out.print("Enter the name for Customer: ");
        String name = scanner.nextLine();
        scanner.nextLine();

        int id =  customerId ;
        customerId = customerId + 1 ;

        personList.add(new Customer(netBalance  ,  name , customerId  )) ;

        System.out.println(" Adding to List of customers...");
    }

    public Boolean  isEnoughBalanceAvailable( int id  , double totalPrice){
        for (Customer customer : personList) {
            if (customer.getId() == id &&  totalPrice  <= customer.getCurrentBalance()) {
                customer.setCurrentBalance(customer.getCurrentBalance() - totalPrice );
                System.out.println("Yes there is Enough Money in Account ");
                return true ;
            }

        }
        return false ;
    }


}

# E-Commerce CLI Application

This project is a simple command-line interface (CLI) e-commerce application that allows users to add customers, browse and add products to a cart, and proceed with a purchase. The application provides options to view, add, delete, and purchase items in a cart.

## Features

- **Add New Customer**: Register a new customer by providing a name.
- **Buy Items in Cart**: Purchase the items in the cart and generate a detailed receipt.
- **Print Items in Cart**: Display all items currently in the cart.
- **Print All Available Products**: View the list of all products available for purchase.
- **Delete All Items from Cart**: Empty the cart of all items.
- **Add Item to Cart**: Add a product to the cart by specifying the product ID and quantity.

## Usage

Upon running the program, you are presented with a menu of options. You can select an action by entering the corresponding number:

```
Choose an action:
1 - Add new Customer
2 - Buy items in the cart
3 - Print items in your cart
4 - Print all available products
5 - Delete all items from cart
6 - Add item in the cart
0 - Exit
```

Follow the prompts to interact with the application. 

### Sample Actions and Outputs

1. **Add New Customer**
   - Enter a customer name to register them.
   - Example:
     ```
     Enter Number for Action :  
     1
     Enter the name for Customer: Mostafa
     
     Adding to List of customers...
     ```

2. **Add Item to Cart**
   - Specify the item ID and quantity to add items to the cart.
   - Example:
     ```
     Enter Number for Action :  
     6
     Enter the id for the item: 50
     Enter the quantity that you want to buy from the item: 3
     
     Item is available. Adding to cart...
     ```

3. **Buy Items in Cart**
   - Confirm purchase of all items in the cart and receive a detailed receipt including subtotal, shipping, and total amount.
   - Example:
     ```
     Enter Number for Action :  
     2
     Enter the id for the Customer: 50
     
     ** Shipment notice **
     3X  Laptop
     ------------------------
     ** Checkout receipt **
     3X  Laptop  3600.0
     -------------------------
     Subtotal :    3600.0
     Shipping       30
     Amount         3630.0
     ```

4. **Delete All Items from Cart**
   - Clear all items in the cart.
   - Example:
     ```
     Enter Number for Action :  
     5
     
     The list of cart is empty now
     ```

5. **Print Items in Cart**
   - Display items in the cart. If empty, it notifies the user.
   - Example:
     ```
     Enter Number for Action :  
     3
     
     The cart is empty
     ```

6. **Print All Available Products**
   - List all products available for purchase.

## Exit

To exit the program, enter `0` at the action prompt.






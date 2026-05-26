package com.pluralsight;

//imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Store {
    //add arrays
    private ArrayList<Product> inventory = new ArrayList<>();
    private ArrayList<CartItems> cartItems = new ArrayList<>();


    //load the given csv with try catch
    public void loadProducts() {
        try {
            //add buff and file reader
            BufferedReader reader = new BufferedReader(new FileReader("products.csv"));
            //add string
            String input;

            //add reader
            reader.readLine();

            //add while statement
            while ((input = reader.readLine()) != null) {

                //add tokens statement to format user input
                String[] tokens = input.split("\\|");

                //add parse for sku
                String sku = tokens[0];

                //parse name
                String name = tokens[1];

                //parse price
                float price = Float.parseFloat(tokens[2]);

                //parse department
                String department = tokens[3];

                //parse full product
                Product product = new Product(sku, name, price, department);

                //add inventory product
                inventory.add(product);
            }
            //close reader
            reader.close();
        }
        //add catch
        catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Error Loading");
        }
    }
    //display products
    public void displayProducts() {
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

    //search products
    public void searchProducts(String keyword) {
        for (Product product : inventory) {
            if(product.getName().toLowerCase().contains(keyword.toLowerCase())
                ||
                    product.getDepartment().toLowerCase().contains(keyword.toLowerCase())) {
                //print sout
                System.out.println(product);
            }
        }
    }

    //add to cart
    public void addToCart(String sku) {

        Product foundProduct = null;

        for (Product product : inventory) {

            if (product.getSku().equalsIgnoreCase(sku)) {
                foundProduct = product;
                break;
            }
        }

        if (foundProduct == null) {

            System.out.println("Product not found.");
            return;
        }

        // check existing cart item
        for (CartItems item : cartItems) {

            if (item.getProduct().getSku().equalsIgnoreCase(sku)) {

                item.increaseQuantity();

                System.out.println("Quantity updated.");
                return;
            }
        }

        boolean add = cartItems.add(new CartItems(foundProduct));


            System.out.println("Added to cart.");

    }

    // DISPLAY CART
    public void displayCart() {

        double total = 0;

        for (CartItems item : cartItems) {

            System.out.println(item.getProduct().getName() + " x" + item.getQuantity() + " = $" + item.getLineTotal());
            total += item.getLineTotal();
        }

        System.out.println("Cart Total: $" + total);
    }

    // REMOVE PRODUCT
    public void removeFromCart(String sku) {

        for (CartItems item : cartItems) {

            if (item.getProduct().getSku().equalsIgnoreCase(sku)) {

                cartItems.remove(item);

                System.out.println("Removed from cart.");

                return;
            }
        }

        System.out.println("Product not found in cart.");
    }
}


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
                double price = Double.parseDouble(tokens[2]);

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
            throw new RuntimeException(e);
            System.out.println("Error Loading");
        }
    }
}

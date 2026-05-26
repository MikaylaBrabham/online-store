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
            }
        }
    }
}

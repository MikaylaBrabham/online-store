package com.pluralsight;

import java.util.Scanner;

public class OnlineStore {
    //add main

        public static void main(String[] args) {

            //add my scanner
            Scanner myScanner = new Scanner(System.in);

            //add the store
            Store store = new Store();
            // add products

            store.loadProducts();

            boolean running = true;
            //create a menu to display options for user to choose
            while (running) {

                System.out.println("\n=== ONLINE STORE ===");

                System.out.println("1 - Display Products");

                System.out.println("2 - Search Products");

                System.out.println("3 - Display Cart");

                System.out.println("4 - Add Product to Cart");

                System.out.println("5 - Remove Product from Cart");

                System.out.println("0 - Exit");

                System.out.print("Choose option: ");

                //add formatter to parse user input
                int choice = Integer.parseInt(myScanner.nextLine());
                //add switch to work with user menu choice

                switch (choice) {

                    case 1:

                        store.displayProducts();

                        break;

                    case 2:

                        System.out.print("Search keyword: ");

                        String keyword = myScanner.nextLine();

                        store.searchProducts(keyword);

                        break;

                    case 3:

                        store.displayCart();

                        break;

                    case 4:

                        System.out.print("Enter SKU: ");

                        String sku = myScanner.nextLine();

                        store.addToCart(sku);

                        break;

                    case 5:

                        System.out.print("Enter SKU to remove: ");

                        String removeSku = myScanner.nextLine();

                        store.removeFromCart(removeSku);

                        break;

                    case 0:

                        running = false;

                        break;

                    default:

                        System.out.println("Invalid choice.");
                }
            }

            System.out.println("Successfully Completed!");
        }
    }

package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineShop {

    static HashMap <String, StoreProducts> products = new HashMap<String, StoreProducts>();


    public static void main(String[] args) {
        // While loop so they can go back from the home screen
        boolean homeScreen = true;
        while (homeScreen) {
//            Display Products
//            Display Cart
//            Exit - closes out of the application
            // Welcome screen
            System.out.println("Welcome to the Online Shop");
            System.out.println("To begin, select an option: ");
            System.out.println("(D) Display Products\n(C) Display Cart\n(X) Exit Application");

            Scanner myScanner = new Scanner(System.in);
            String homeOption = myScanner.nextLine();

            // Options for Home screen with switch/case

            switch (homeOption) {

                case "D":
                    displayProducts();
                    break;

                case "C":
                    displayCart();
                    break;

                case "X":
                    homeScreen = false;
                    break;

                default:
                    System.out.println("Select Valid Input");
            }


        }

    }

    public static void displayProducts() {
//        Search or filter the list of products
//                - Add a product to their cart
//                - Go Back to the home page
        System.out.println("Available Products: ");
        for (Map.Entry<String , StoreProducts> entry : products.entrySet()) {// come back to fix this
            StoreProducts products  = entry.getValue();
            System.out.println(products.getProductName() + " -$" + products.getPrice());
        }

        System.out.println("1. Search for Filter Products ");
        System.out.println("2. Add Product to Cart ");
        System.out.println("3. Go Back ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                searchProducts(); // Search Functionality
                break;
            case 2:
                addProductstoCart(); // adding products to carts
                break;
            case 3:
                displayHomeScreen(); // go back to home screen page
                break;
            default:
                System.out.println("Invalid option, please try again");
                displayProducts(); // re display products
        }


    }

    // Creating method to search products
    public static void searchProducts() {
        System.out.println(" Enter the product name: ");
        Scanner scanner = new Scanner(System.in);
        String searchBar = scanner.nextLine();

//            public static ArrayList <Product> getInventory() {

//        ArrayList<StoreProducts> filterProduct = get();
        StoreProducts filterProduct = products.get(searchBar);
        for (StoreProducts products2: products) {
            if (products2.getProductName().toLowerCase().contains(searchBar)) filterProduct.add(products);
            }

            if (filterProduct.isEmpty()) {
                System.out.println("This item is not available ");
            } else {
                System.out.println("These are the results: ");
                for (StoreProducts products1 : products ) { // come back to fix this
                    System.out.println(products1.getProductName() + " -$" + products1.getPrice());

                }
            }
            displayProducts();

        }

    }
        // Adding item to cart method
        private static void addProductstoCart() {
        System.out.println("Enter the name of the product you would like to add to your cart: ");
        Scanner scanner = new Scanner(System.in);
        String itemChoice = scanner.nextLine();

        // searching product by name
            for (StoreProducts products : StoreProducts) {
                if(products.getProductName().equalsIgnoreCase(products.getProductName()){
                products.add(products);
                    System.out.println(products.getProductName() + "added to cart.");
                    break;
            }

            }

    }


}


package Ayse.Product;

import Jeren.Dairy;
import Karlygash.Bakery;

import java.util.ArrayList;
import java.util.Arrays;

public class JEKApp {

        public static void main(String[] args) {
            Snack snack1 = new Snack("Chips", 1, 3.99);
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.addProduct(snack1);
            Snack snack2 = new Snack("Coke",  3, 7.99);
            Snack snack3 = new Snack("Popcorn", 2, 10.59);
            Snack snack4 = new Snack("Candy",  5, 0.50);
            Product[] products = {snack2, snack3, snack4};
            shoppingCart.addProduct(products);
            System.out.println(shoppingCart);
            //added by esma

            Snack snack5 = new Snack( "gummy", 4, 0.75);
            Bakery bakery1 = new Bakery("Donut", 15, 8.5);
            Dairy dairy1 = new Dairy(10.0, 0.90,"egg");
            ArrayList<Product> products2 = new ArrayList<>(Arrays.asList(snack2,snack4));
            shoppingCart.setProducts(products2);
            shoppingCart.addProduct(snack5);
            shoppingCart.addProduct(bakery1);
            shoppingCart.addProduct(dairy1);
            System.out.println(shoppingCart.getCartList());

        }
    }



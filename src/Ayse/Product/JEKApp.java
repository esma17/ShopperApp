package Ayse.Product;

import Jeren.Dairy;
import Karlygash.Bakery;

import java.util.ArrayList;
import java.util.Arrays;

public class JEKApp {

        public static void main(String[] args) {
            //Snack snack1 = new Snack("Chips", 1);
            ShoppingCart shoppingCart = new ShoppingCart();
            //shoppingCart.addProduct(snack1);
            //Snack snack2 = new Snack("Coke",  3);
            //Snack snack3 = new Snack("Popcorn", 2);
            //Snack snack4 = new Snack("Candy",  5);
            //Product[] products = {snack2, snack3, snack4};
            //shoppingCart.addProduct(products);
            //System.out.println(shoppingCart);
            //added by esma

            //Snack snack5 = new Snack( "gummy", 4);
            //Bakery bakery1 = new Bakery("Donut", 15);
            //Dairy dairy1 = new Dairy("Milk", 0.90);
            Vegetable vegetable1 = new Vegetable("onion", 6 ); // we don't need name and quantity as parameter
                                                                                    //we can use scanner, we only need create object
            //ArrayList<Product> products2 = new ArrayList<>(Arrays.asList(vegetable1));
            //shoppingCart.setProducts(products2);
            //shoppingCart.addProduct(snack5);
            //shoppingCart.addProduct(bakery1);
            //shoppingCart.addProduct(dairy1);
            //shoppingCart.addProduct(vegetable1);
            System.out.println(vegetable1);

        }
    }



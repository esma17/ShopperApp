package Ayse.Product;

public class JEKApp {

        public static void main(String[] args) {
            Product product1 = new Product("Chips", "001", 1, 3.99);
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.addProduct(product1);
            Product product2 = new Product("Coke", "002", 3, 7.99);
            Product product3 = new Product("Popcorn", "003", 2, 10.59);
            Product product4 = new Product("Candy", "004", 5, 0.50);
            Product[] products = {product2, product3, product4};
            shoppingCart.addProduct(products);
            System.out.println(shoppingCart);
        }
    }



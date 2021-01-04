package Ayse.Product;

import java.util.ArrayList;
import java.util.Arrays;

   public class ShoppingCart {
        private ArrayList<Product> cartList = new ArrayList<>();
        public void setProducts(ArrayList<Product> products) {
            this.cartList = products;
        }

       public ArrayList<Product> getCartList() {
           return cartList;
       }

       public void addProduct(Product product) {
            cartList.add(product);
        }
        public void addProduct(Product[] products) {
            cartList.addAll(Arrays.asList(products));
        }
        public void removeProduct(Product product) {
            cartList.remove(product);
        }
        public void removeProduct(Product[] products) {
            cartList.removeAll(Arrays.asList(products));
        }
        @Override
        public String toString() {
            return "";
        }
    }


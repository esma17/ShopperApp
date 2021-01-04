package Jeren;

import Ayse.Product.Product;

public class Dairy extends Product {

    String dairyName;
    String weight;
    public Dairy(String productID, int quantity, double productPrice, String dairyName) {
        super("Dairy", productID, quantity, productPrice);
        this.dairyName = dairyName;
    }

    public Dairy(String productName, String productID, double productPrice) {
        super(productName, productID, productPrice);
    }
}

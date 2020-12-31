package Karlygash;

import Ayse.Product.Product;

public class Bakery extends Product {

    private String bakeryName;

    public Bakery(String bakeryName, String productID, int quantity, double productPrice) {
        super("Bakery", productID, quantity, productPrice);
        this.bakeryName = bakeryName;
    }

    public String getBakeryName() {
        return bakeryName;
    }

    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }

    @Override
    public String toString() {
        return "\u2665"+"Bakery" +"\u2665"+
                "\nName: " + bakeryName +
                "\nLabel: " + getProductID()+
                "\nQuantity: "+getQuantity()+
                "\nTotal Price: $"+calculateCost();

    }
}

package Jeren;

import Ayse.Product.Product;

public class Dairy extends Product {

    private String dairyName;
    private double weight;
    public Dairy(String productID, int quantity, double productPrice, String dairyName) {
        super("Dairy", productID, quantity, productPrice);
        this.dairyName = dairyName;
    }

    public Dairy( String productID, double productPrice, double weight, String dairyName) {
        super("Dairy", productID, productPrice);
        this.weight = weight;
        this.dairyName = dairyName;
    }

    public double getWeight() {
        return weight;
    }

    public String getDairyName() {
        return dairyName;
    }

    @Override
    public double calculateCost() {
        if (getQuantity()>0 && getQuantity()<20)
            return super.calculateCost();
        else if (getWeight()>0)
            return getWeight() * getProductPrice();
        return 0;
    }

    @Override
    public String toString() {
        return "Dairy{" +
                "weight = " + weight +
                ", dairyName = '" + dairyName + '\'' +
                ", total price = $"+ calculateCost() +"}";

    }
}

package Ayse.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Product {

    private String productName, productID;
    private int quantity;
    private double productPrice, total;
    static int nextID = 100000;

    public Product(String productName, int quantity, double productPrice) {
        this.productName = productName;
        productID = productName.substring(0,1) + nextID;
        nextID++;
        this.quantity = quantity;
        this.productPrice = productPrice;
        total = calculateCost();
    }

    public Product(String productName,  double productPrice) {
        this.productName = productName;
        productID = productName.substring(0,1) + nextID;
        nextID++;
        this.productPrice = productPrice;
        total = calculateCost();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double calculateCost(){
        total = productPrice * quantity;
        return  total;
    }

    @Override
    public String toString() {
        return "";
    }
}



















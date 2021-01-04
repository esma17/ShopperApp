package Ayse.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Product {

    private String productName, productID;
    private int quantity;
    private double productPrice, total;
    static int nextID = 0;

    public Product(String productName, int quantity) {
        System.out.println("Enter your product name:");
        this.productName = productName;
        productID =  productName.substring(0,2) + "#" + nextID;
        nextID++;
        //System.out.println("Enter quantity");
        //Scanner input = new Scanner(System.in);
        this.quantity = quantity; //input.nextInt();

        productPrice = priceList();
        total = calculateCost();
    }

    public Product(String productName) {
        this.productName = productName;
        productID = productName.substring(0,2) + "#" + nextID;
        nextID++;
        productPrice = priceList();
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

    public double priceList(){
        return productPrice;
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



















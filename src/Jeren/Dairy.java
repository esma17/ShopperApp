package Jeren;

import Ayse.Product.Product;

import java.util.Scanner;

public class Dairy extends Product {

    private String dairyName;
    private double weight;
    public Dairy(String dairyName, int quantity) {
        super("Dairy",  quantity);
        System.out.println("Enter your dairy name:");
        this.dairyName = dairyName;
    }

    public Dairy(String dairyName, double weight) {
        super("Dairy");
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
    public double priceList() {
        Scanner input = new Scanner(System.in);
        dairyName = input.nextLine();
        switch (dairyName){
            case "milk":
                setProductPrice(0.55);
                return getProductPrice();
            case "yogurt":
                setProductPrice(1.98);
                return getProductPrice();
            case "ayran":
                setProductPrice(1.50);
                return getProductPrice();
            case "butter":
                setProductPrice(0.75);
                return getProductPrice();
            case "egg":
                setProductPrice(1.6);
                return getProductPrice();
            case "cheese":
                setProductPrice(1.19);
                return getProductPrice();
            case "ice cream":
                setProductPrice(1.9);
                return getProductPrice();
            case "condensed":
                setProductPrice(0.8);
                return getProductPrice();
            case "dried milk":
                setProductPrice(2);
                return getProductPrice();
            default:
                setProductPrice(0.0);
                return getProductPrice();
        }

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
        return "\n\u2665"+"Dairy" +"\u2665"+
                "\nName: " + dairyName +
                "\nLabel: " + getProductID()+
                "\nTotal Price: $"+ calculateCost();

    }
}

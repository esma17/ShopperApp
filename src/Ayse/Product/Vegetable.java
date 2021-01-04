package Ayse.Product;

import java.util.Scanner;

public class Vegetable extends Product {

    private String vegetableName;
    private double weight;


    public Vegetable(String vegetableName, int quantity) {
        super("Vegetable", quantity);
        System.out.println("Enter your fruit name:");
        this.vegetableName = vegetableName;
    }

    public Vegetable(String vegetableName, double weight) {
        super("Vegetable");
        System.out.println("Enter your fruit name:");
        this.vegetableName = vegetableName;
        this.weight = weight;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double priceList() {
        Scanner input = new Scanner(System.in); // added scanner class
        vegetableName = input.nextLine();
        switch (vegetableName){
            case "pepper":
                 setProductPrice(0.55);
                 return getProductPrice();
            case "onion":
                setProductPrice(1.98);
                return getProductPrice();
            case "potato":
                setProductPrice(1.50);
                return getProductPrice();
            case "tomato":
                setProductPrice(0.75);
                return getProductPrice();
            case "broccoli":
                setProductPrice(1.6);
                return getProductPrice();
            case "carrot":
                setProductPrice(1.19);
                return getProductPrice();
            case "cauliflower":
                setProductPrice(1.9);
                return getProductPrice();
            case "spinach":
                setProductPrice(0.8);
                return getProductPrice();
            case "asparagus":
                setProductPrice(2);
                return getProductPrice();
            case "green bean":
                setProductPrice(0.7);
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
        return "\n\u2665"+"Vegetable" +"\u2665"+
                "\nName: " + vegetableName +
                "\nLabel: " + getProductID()+
                "\nTotal Price: $"+calculateCost();
    }
}

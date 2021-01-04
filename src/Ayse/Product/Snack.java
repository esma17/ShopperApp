package Ayse.Product;

import java.util.Scanner;

public class Snack extends Product {

    private String snackName;

    public Snack(String snackName, int quantity) {
        super("Snack",  quantity);
        System.out.println("Enter your snack name:");
        this.snackName = snackName;
    }

    public String getSnackName() {
        return snackName;
    }

    @Override
    public double priceList() {
        Scanner input = new Scanner(System.in);
        snackName = input.nextLine();
        switch (snackName){
            case "candy":
                setProductPrice(0.55);
                return getProductPrice();
            case "gummy":
                setProductPrice(1.98);
                return getProductPrice();
            case "chips":
                setProductPrice(1.50);
                return getProductPrice();
            case "cookie":
                setProductPrice(0.75);
                return getProductPrice();
            case "chocolate":
                setProductPrice(1.6);
                return getProductPrice();
            case "pistachios":
                setProductPrice(1.19);
                return getProductPrice();
            case "pecans":
                setProductPrice(1.9);
                return getProductPrice();
            case "nuts":
                setProductPrice(0.8);
                return getProductPrice();
            case "trail mix":
                setProductPrice(2);
                return getProductPrice();
            case "popcorn":
                setProductPrice(0.7);
                return getProductPrice();
            default:
                setProductPrice(0.0);
                return getProductPrice();
        }

    }



    @Override
    public double calculateCost() {
        return super.calculateCost();
    }

    @Override
    public String toString() {
        return "\n\u2665"+"Snack" +"\u2665"+
                "\nName: " + snackName +
                "\nLabel: " + getProductID()+
                "\nQuantity: "+getQuantity()+
                "\nTotal Price: $"+calculateCost();
    }
}

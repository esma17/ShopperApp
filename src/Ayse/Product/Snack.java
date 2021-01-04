package Ayse.Product;

public class Snack extends Product {

    private String snackName;

    public Snack(String snackName, int quantity, double productPrice) {
        super("Snack",  quantity, productPrice);
        this.snackName = snackName;
    }

    public String getSnackName() {
        return snackName;
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

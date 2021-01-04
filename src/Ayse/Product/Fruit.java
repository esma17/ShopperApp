package Ayse.Product;


import java.util.Scanner;

public class Fruit extends Product{

        private double weight;
        private String fruitName;

        public Fruit(String fruitName, int quantity) {
            super("Fruit", quantity);
            System.out.println("Enter your fruit name:");
            this.fruitName = fruitName;
        }

        public Fruit(String fruitName, double weight) {
            super("Fruit");
            this.weight = weight;
            this.fruitName = fruitName;
        }

        public double getWeight() {
            return weight;
        }

        public String getFruitName() {
            return fruitName;
        }

    @Override
    public double priceList() {
        Scanner input = new Scanner(System.in);
        fruitName = input.nextLine();
        switch (fruitName){
            case "apple":
                setProductPrice(0.55);
                return getProductPrice();
            case "banana":
                setProductPrice(1.98);
                return getProductPrice();
            case "lemon":
                setProductPrice(1.50);
                return getProductPrice();
            case "grape":
                setProductPrice(0.75);
                return getProductPrice();
            case "strawberry":
                setProductPrice(1.6);
                return getProductPrice();
            case "watermelon":
                setProductPrice(1.19);
                return getProductPrice();
            case "blueberry":
                setProductPrice(1.9);
                return getProductPrice();
            case "raspberry":
                setProductPrice(0.8);
                return getProductPrice();
            case "mango":
                setProductPrice(2);
                return getProductPrice();
            case "orange":
                setProductPrice(0.7);
                return getProductPrice();
            /*
            case "mandarin":
                setProductPrice(0.8);
                return getProductPrice();
            case "cherry":
                setProductPrice(0.7);
                return getProductPrice();
            case "cranberry":
                setProductPrice(0.7);
                return getProductPrice();
            case "peach":
                setProductPrice(0.7);
                return getProductPrice();
             */
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
            return "\n\u2665"+"Fruit" +"\u2665"+
                    "\nName: " + fruitName +
                    "\nLabel: " + getProductID()+
                    "\nTotal Price: $"+calculateCost();

        }
    }


























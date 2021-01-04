package Ayse.Product;


    public class Fruit extends Product{

        private double weight;
        private String fruitName;

        public Fruit(String fruitName, int quantity, double productPrice) {
            super("Fruit", quantity, productPrice);
            this.fruitName = fruitName;
        }

        public Fruit(String fruitName, double weight, double productPrice) {
            super("Fruit",  productPrice);
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


























package Ayse.Product;


    public class Fruit extends Product{

        private double weight;
        private String fruitName;

        public Fruit( String productID, int quantity, double productPrice,String fruitName) {
            super("Fruit", productID, quantity, productPrice);
            this.fruitName = fruitName;
        }

        public Fruit( String productID, double productPrice, double weight, String fruitName) {
            super("Fruit", productID, productPrice);
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
            return "Fruit{" +
                    "weight=" + weight +
                    ", fruitName='" + fruitName + '\'' +
                    "total price ="+ calculateCost();

        }
    }


























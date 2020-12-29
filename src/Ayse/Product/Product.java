package Ayse.Product;

public class Product {

        private String productName, productID;
        private int quantity;
        private double productPrice, total;
        public Product(String productName, String productID, int quantity, double productPrice) {
            this.productName = productName;
            this.productID = productID;
            this.quantity = quantity;
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
            return "Product{" +
                    "productName='" + productName + '\'' +
                    ", productID='" + productID + '\'' +
                    ", quantity=" + quantity +
                    ", productPrice=" + productPrice +
                    ", total=" + total +
                    '}';
        }
    }





package Esma;

import java.time.LocalDate;

public class Customer extends User {
    private String customerID, customerPassword, paymentType, cardNumber,  securityCode;
    private LocalDate expiringDate;

    public Customer(String customerID, String customerPassword) {
        this.customerID = customerID;
        this.customerPassword = customerPassword;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPasswordPassword(String shopperPassword) {
        if (passwordChecker(shopperPassword)) this.customerID=customerPassword;
        else System.out.println("Please try again. Invalid Password");

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", expiringDate=" + expiringDate +
                '}';
    }
}

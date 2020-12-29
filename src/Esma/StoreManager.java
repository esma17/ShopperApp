package Esma;

public class StoreManager extends User {
    private String storeManagerUserID;
    private String storeManagerPassword;

    public StoreManager(String firstName, String lastName, String storeManagerPassword) {
        this.storeManagerUserID = userNameGenerator(firstName, lastName);
        if (passwordChecker(storeManagerPassword))
            this.storeManagerPassword = storeManagerPassword;
        else {
            System.out.println("try again");
        }
    }

    public String getStoreManagerUserID() {
        return storeManagerUserID;
    }

    public String getStoreManagerPassword() {
        return storeManagerPassword;
    }

    public void setStoreManagerUserID(String storeManagerUserID) {
        this.storeManagerUserID = storeManagerUserID;
    }

    public void setStoreManagerPassword(String storeManagerPassword) {
        if (passwordChecker(storeManagerPassword)) this.storeManagerPassword = storeManagerPassword;
        else System.out.println("Please try again. Invalid Password");
    }

    @Override
    public String toString() {
        return "StoreManager{" +
                "storeManagerUserID='" + storeManagerUserID + '\'' +
                ", storeManagerPassword='" + storeManagerPassword + '\'' +
                '}';
    }
}

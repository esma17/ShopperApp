package Esma;

import java.util.Random;

public class User {

    // checks if the password meets the criteria length=8 at least:
    // 1 special char, 1 digit,1letter,1 uppercase letter , 1 lower case letter


    public boolean passwordChecker(String password){
            int digitcount = 0, lowerCaseCount = 0, upperCasecount = 0, specialchar = 0, letterCount = 0;
            char[] password1 = password.toCharArray();
            for (char each : password1) {
                if (Character.isDigit(each)) digitcount++;
                else if (Character.isLetter(each)) letterCount++;
                if (Character.isLowerCase(each)) lowerCaseCount++;
                if (Character.isUpperCase(each)) upperCasecount++;
                if ((!Character.isLetter(each)) && !(Character.isDigit(each))) specialchar++;

            }
            if (digitcount >= 1 && letterCount >= 1 && lowerCaseCount >= 1 && upperCasecount >= 1 && specialchar >= 1 && password1.length == 8) {
               return true;
            } else {
            return false;




        }
    }
    //from fname and lname generates a userName
    public String userNameGenerator(String firstname,String lastName){
        if (firstname.length()<3||lastName.length()<3) System.out.println("try again");

            Random rnd = new Random();
             int x = rnd.nextInt(90) + 10;

            return firstname.substring(0, 2) + lastName.substring(0, 2) + x;


    }
}

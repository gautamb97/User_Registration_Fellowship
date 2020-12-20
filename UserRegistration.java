import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
    static Scanner userInput = new Scanner(System.in);
    public void firstNameVerification(){
        System.out.println("Enter your first name: ");
        String first_name = userInput.next();
        if(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$",first_name)==true)
            System.out.println(first_name);
        else {
            System.out.println("invalid first name re-enter your name");
            firstNameVerification();
        }
    }
    //last name validation
    public void lastNameVerification() {
        System.out.println("Enter your last name: ");
        String last_name = userInput.next();
        if (Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", last_name) == true)
            System.out.println(last_name);
        else {
            System.out.println("invalid last name re-enter your name");
            lastNameVerification();
        }
    }
    //email verification
    public void emailVerification() {
        System.out.println("Enter your email id: ");
        String email_verification = userInput.next();
        if (Pattern.matches("^[a-z0-9\\.\\_\\-\\+a-z0-9]*\\@[a-z0-9]*\\.(com|org|in|co|net|com\\.au|com\\.com)", email_verification) == true)
            System.out.println(email_verification);
        else {
            System.out.println("invalid email id re-enter your email id");
            emailVerification();
        }
    }
    //mobile number verification
    public void mobileNumberVerification(){
        System.out.println("Enter your mobile number: ");
        String mobile_number_verification = userInput.next();
        if (Pattern.matches("^(\\+91)?[6-9]{1}[0-9]{9}$", mobile_number_verification) == true)
            System.out.println(mobile_number_verification);
        else {
            System.out.println("invalid mobile number re-enter your mobile number");
            mobileNumberVerification();
        }
    }
    //Password rules passing
    public void passwordVerification(){
        System.out.println("Enter your password: ");
        String password_verification = userInput.next();
        if (Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*\\W)[a-zA-Z0-9\\#]{8,}$", password_verification) == true)
            System.out.println("*******************");
        else {
            System.out.println("invalid password re-enter your password");
            passwordVerification();
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome for Registration");
        UserRegistration validation = new UserRegistration();
        validation.firstNameVerification();
        validation.lastNameVerification();
        validation.emailVerification();
        validation.mobileNumberVerification();
        validation.passwordVerification();
    }
}

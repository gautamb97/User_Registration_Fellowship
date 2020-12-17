import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
    public void firstName(){
        Scanner firstName = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String first_name = firstName.next();
        if(Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$",first_name)==true)
            System.out.println(first_name);
        else {
            System.out.println("invalid first name re-enter your name");
            firstName();
        }
    }
    //last name validation
    public void lastName() {
        Scanner lastName = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String last_name = lastName.next();
        if (Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$", last_name) == true)
            System.out.println(last_name);
        else {
            System.out.println("invalid last name re-enter your name");
            lastName();
        }
    }
    //email verification
    public void email() {
        Scanner email = new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String email_verification = email.next();
        if (Pattern.matches("^[a-z]*\\@[a-z]*\\.(com|org|com\\.co|com\\.edu)", email_verification) == true)
            System.out.println(email_verification);
        else {
            System.out.println("invalid email id re-enter your email id");
            email();
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome for Registration");
        UserRegistration validation = new UserRegistration();
        validation.firstName();
        validation.lastName();
        validation.email();
    }
}

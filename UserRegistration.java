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
    public static void main(String[] args){
        System.out.println("Welcome for Registration");
        UserRegistration validation = new UserRegistration();
        validation.firstName();
        validation.lastName();
    }
}

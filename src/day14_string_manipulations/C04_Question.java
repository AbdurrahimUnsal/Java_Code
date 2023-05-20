package day14_string_manipulations;
import java.util.Scanner;
public class C04_Question {
     /*
    QUESTION : get an email from the user
    - if the email does not contain @, print "invalid mail"
    - if the email does not contain @gmail.com, "email must be gmail"
    - if the email does not end with @gmail.com , print "there is a typo in the mail"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your email address");
        String email = scan.nextLine();

        if(!email.contains("@")){
            System.out.println("invalid email");
        }else if(!email.contains("@gmail.com")){
            System.out.println("email must be gmail");
        }else if(!email.endsWith("@gmail.com")) {
            System.out.println("there is a typo in the mail");
        }




    }
}

package day22_method_and_while_loops;
import java.util.Scanner;
public class C03_Question3 {
    // ask for a password from user until user provide and acceptable password
    // it should meet the conditions mentioned below
    // print the errors and ask to fix them
    // when user enters  correct password, print " creating a password is successful

    // 1) first letter should be a lowercase
    // 2) last letter should be a capital
    // 3) password should not have any spaces
    // 4) it should have at least 8 characters

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password="";
        int flag = 0;

        while (flag!=4){
            flag =0;
            System.out.println("Please enter a password");
            password = scan.nextLine();

            // 1) first letter should be a lowercase
            if(password.charAt(0)>='a' && password.charAt(0)<='z'){
                flag++;
            }else{
                System.out.println("first letter should be a lowercase");
            }

            // 2) last letter should be a capital
            if(password.charAt(password.length()-1)>='A' && password.charAt(password.length()-1)<='Z'){
                flag++;
            }else{
                System.out.println("last letter should be a capital");
            }

            // 3) password should not have any spaces
            if(!password.contains(" ")){
                flag++;
            }else{
                System.out.println("password should not have any spaces");
            }

            // 4) it should have at least 8 characters
            if(password.length()<8){
                System.out.println("it should have at least 8 characters");
            }else {
                flag++;
            }

        }

        System.out.println("creating a password is successful");

    }
}

package day16_string_manipulations;

public class C09_Question3 {
    //Question 4 : Ask the user for a password,
    // check the following terms and tell the user any missing terms that need to be corrected,
    // if it satisfies all conditions, print "password saved successfully"

    // - the first letter must be lowercase
    // - the last character must be a number
    // - the password must not contain spaces
    // - the length must be at least 10 characters

    public static void main(String[] args) {

        int flag = 0;
        String password = "aAamm12@12";

        // 1) the first letter must be lowercase
        if(password.charAt(0)>= 'a' && password.charAt(0)<='z') {
            flag++; // flag = flag +1;
        }else{
            System.out.println("the first letter must be lowercase");
        }

        //2) the last character must be a number
        int lastIndex = password.length()-1;

        if(password.charAt(lastIndex)>= '0' && password.charAt(lastIndex)<= '9'  ){
            flag++;
        }else{
            System.out.println("the last character must be a number");
        }

        // 3) the password must not contain spaces

        if(!password.contains(" ")) {
            flag++;
        }else{
            System.out.println("the password must not contain spaces");
        }

        // 4) the length must be at least 10 characters

        if(password.length() >= 10){
            flag++;
        }else{
            System.out.println("the length must be at least 10 characters");
        }

        //5) all conditions are met
        if(flag == 4) {
            System.out.println("password saved successfully");
        }



    }
}

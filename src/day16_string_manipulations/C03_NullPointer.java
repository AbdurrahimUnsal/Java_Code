package day16_string_manipulations;

public class C03_NullPointer {
    public static void main(String[] args) {

        String str; // Just declared the variable, no assignment

//        System.out.println(str); // CTE
//        System.out.println(str.concat("John")); //CTE

        //you can create a variable without assigning a value, but you cannot use it in you code blocks

//        String newStr = null;
//
//        System.out.println(newStr);//null
//        System.out.println(newStr.concat("John")); //RTE

        //We have assigned any value to this string, but still if we want to use this variable, wee need to assign null value

        String str2 = "null"; //this is not a null pointer, a regular string

        String str3 = "";  //we are assigning nothing
        System.out.println(str3);
        System.out.println(str3.length());
        System.out.println(str3.concat("John"));





    }
}

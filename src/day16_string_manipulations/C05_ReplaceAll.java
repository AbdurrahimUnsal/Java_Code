package day16_string_manipulations;

public class C05_ReplaceAll {
     /*
    Regex ( Regular Expressions )
    \\s : space 		\\S : everything that is not space 		\\s+ : multiple spaces side by side
    \\d : digits 		\\D : everything non-digit
    \\w : letter or number 	\\W : anything that is not a letter or number
     */

    public static void main(String[] args) {

        String str = "J123a   va6587 i#$%s very fun    67867ny";
        System.out.println(str);

        //Clean str from number
        str = str.replaceAll("\\d", ""); // replaces all numbers with nothing
        System.out.println(str);

        str = str.replaceAll(" ", "5"); //I have replaces space with 5
        System.out.println(str);

        str = str.replaceAll("\\W", "");//cleared all but numbers and letters
        System.out.println(str);

        str = str.replaceAll("\\d", " ");//replaces all digits with space
        System.out.println(str);

        str = str.replaceAll("\\s+", " ");
        System.out.println(str);

        //If you want to change group of characters, you can use regex with replace all method


    }

}

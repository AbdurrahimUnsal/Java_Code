package day14_string_manipulations;

public class C01_SubString {
    public static void main(String[] args) {

        String str = "Java is beautiful";



        System.out.println(str.substring(3));// a is beautiful
        System.out.println(str.substring(0));// Java is beautiful
        System.out.println(str);// Java is beautiful

        System.out.println(str.substring(str.length()));//17 is the length nothing


        System.out.println(str.substring(str.length()-1)); // index 16 which is going to print the last char "l"
        System.out.println(str.substring(str.length()-3)); //  "ful"

        //System.out.println(str.substring(145)); it will throw an exception

        System.out.println(str.substring(8,10)); //be  when we pass two parameters, substring include first index but does NOT include the second index
        System.out.println(str.substring(10,13));
        System.out.println(str.substring(4,13));

        System.out.println(str.charAt(6)); //s
        System.out.println(str.substring(6,7)); //s

        System.out.println(str.substring(6,6)); // it will print nothing

        System.out.println(str.substring(8, 1)); // RTE




    }
}

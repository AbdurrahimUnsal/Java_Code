package day13_string_manipulations;

public class C01_Equals {
    public static void main(String[] args) {

        String str1 = "Java";

        String str2 = "Java";

        String str3 = "Ja";
        String str4 = "va";
        String str5 = str3+str4 ;


        System.out.println(str3+str4);


        //It will return not equal because of " =="
        //NOTE: For any non_primitive data type, we won't use "=="
        if(str1 == str5) {
            System.out.println("yes, they are equal");
        }else {
            System.out.println("no, they are not equal");
        }

        //equals() method compares each index for equality and returns boolean value
        //Equals() method is case-sensitive

        if(str1.equals(str5)) {
            System.out.println("yes, they are equal");
        }else {
            System.out.println("no, they are not equal");
        }

        String str6 = "Java is GREAT";
        String str7 = "JaVa is great";


        if(str6.equals(str7)) {
            System.out.println("yes, they are equal");
        }else {
            System.out.println("no, they are not equal");
        }

        //equalsIgnoreCase() will ignore the casing
        if(str6.equalsIgnoreCase(str7)) {
            System.out.println("yes, they are equal");
        }else {
            System.out.println("no, they are not equal");
        }




    }
}

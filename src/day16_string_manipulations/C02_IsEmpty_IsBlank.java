package day16_string_manipulations;

public class C02_IsEmpty_IsBlank {
    public static void main(String[] args) {

        String str = "Java is the life";

        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false

        String str2 = "       ";
        System.out.println(str2.isEmpty());//false
        System.out.println(str2.isBlank());//true

        String str3 = "";
        System.out.println(str3.isEmpty());//True
        System.out.println(str3.isBlank());//true



        System.out.println(str.length());//16
        System.out.println(str2.length());//7
        System.out.println(str3.length());//0


    }
}

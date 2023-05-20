package day35_passbyvalue_immutableclass_date;

public class C04_StringPool {
    public static void main(String[] args) {

        String str1 = "Java";       // Java
        String str2 = "Java";       // Java
        String str3 = new String("Java");
        String str4 = "Ja" + "va";   // Java
        String s = "Ja";
        String t = "va";
        String str5 = s.concat(t);  // Java


        //We prefer to check equality of non-primitive data with the equals().
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true

        System.out.println("==============================");

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true
        System.out.println(str1==str5);//false

    }
}

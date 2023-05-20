package day13_string_manipulations;

public class C03_Concat {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "easy";
        String str4 =  " ";

        System.out.println(str1+str4+str2+str4+str3);

        // we used concat() method

        System.out.println(str1.concat(str4).concat(str2).concat(str4).concat(str3));

    }
}

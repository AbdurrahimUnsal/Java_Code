package day07;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is fun";

        System.out.println(str1+str2); // Javais fun
        System.out.println(str1+ " " +str2); //Java is fun

        int num1 = 10;
        int num2 = 20;

        System.out.println(str1+num1+num2); //Java1020
        System.out.println(num1+num2+str1); //30Java
        System.out.println(num1 + " " + num2); //10 20
        System.out.println(str1 + num1 * num1); //Java100
        System.out.println(str1+(num1-num2)); // Java-10

        boolean bl1 = true;
        boolean bl2 = false;

        System.out.println(bl1 + str1); //trueJava
        System.out.println(bl1+""+bl2); //truefalse

        //String is strong: When string type faces to other data types, result will be a string




    }
}

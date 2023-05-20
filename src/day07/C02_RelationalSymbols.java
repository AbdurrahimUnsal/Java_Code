package day07;

public class C02_RelationalSymbols {
    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        int c= 30;

        System.out.println(a==b); //false == sign checks the equality and returns true or false

        System.out.println(a!=b); //true  != sign checks the inequality and returns true or false

        //AND operator (&&)
        System.out.println(a<b && b<c); //true && sign means and. it only returns true when all options are true

        System.out.println(b<a && b<c); //false

        System.out.println(a<b && c<b); //false

        System.out.println(b<a && c<b); //false

        //OR operator (||)
        System.out.println(a<b || b<c); //true

        System.out.println(b<a || b<c); //true

        System.out.println(a<b || c<b); //true

        System.out.println(b<a || c<b); //false || sign means or. it only returns false when all options are false


        String str1 = "Java";
        String str2 = "is fun";
        String str3 = "Java";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(a+str1 == str1+a); //false
        System.out.println(a+str1 != str1+a); //true

        boolean bl = false;

        boolean blResult = !bl && (a+str1 != str1+a);
        System.out.println( blResult); //true

        // ! sign is going to revert the value of boolean





    }
}

package day14_string_manipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str = "Learn Java, get the job";

        System.out.println(str.contains("java")); // false
        System.out.println(str.contains("Java")); // true

        String desiredWord = "Le";

        System.out.println(str.contains(desiredWord)); //true

        System.out.println(str.contains(" ")); //true

        System.out.println(str.contains("a")); //true


        if(str.contains("java")){
            System.out.println("Yes, it contains");
        } else {
            System.out.println("No, it doesn't contain");
        }




    }
}

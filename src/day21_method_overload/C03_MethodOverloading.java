package day21_method_overload;

public class C03_MethodOverloading {
    // How does java find the method
    /*
    1) it will check the names
    2) it will check the arguments/parameters if they %100 match with parameters
    3) can java handle the situation by auto casting
    4) java will pick the easiest one (if less casting)
     */

    //How we can achieve method overloading
    /*
    on the same java class
    1) by using different number of parameters
    2) by using different data types
     */

    public static void main(String[] args) {

        add(4,5);

        add(3.4, 4.5);

        add(3, 6, 7);

        add(5.1,9);

        add("ali", " Can");

    }


    public static void add(int a, int b){
        System.out.println("The sum of two integers:  " + (a+b));
    }

    public static void add(double a, double b){
        System.out.println("The sum of two double:  " + (a+b));
    }

    public static void add(int a, int b, int c){
        System.out.println("The sum of three integers:  " + (a+b+c));
    }

    public static void add(int a, double b){
        System.out.println("The sum of an integers and a double:  " + (a+b));
    }

    public static void add(double a, int b){
        System.out.println("The sum of an integers and a double:  " + (a+b));
    }

    public static void add(String a, String b){
        System.out.println("The sum of an integers and a double:  " + (a+b));
    }



}

package day24scope_and_arrays;

public class C02_Scope2 {
    static int number=10;
    static String name;
    static boolean bl;  //if you don't assign any value for class level static variables, java will assign some default values
    static char ch;
    static int num1;
    int num2;
    boolean bl2;

    public static void main(String[] args) {

        String str2;

        System.out.println(number);//10
        System.out.println(name); //null
        System.out.println(bl); //false
        System.out.println(ch); // interesting shape
        System.out.println(num1); //0

//        System.out.println(num2); //num2 and bl2 are not static variables, so we cannot use them in static methods
//        System.out.println(bl2);

        //System.out.println(str2);//if we create a variable in the method without assignment, we cannot use it CTE

        System.out.println("===============================================================");

        number = 20; //we can update the value of class level variables anywhere in the class
        secondMethod();
        System.out.println(number);


    }

    public static void secondMethod(){

        System.out.println(number);//20
        System.out.println(name); //null
        System.out.println(bl); //false
        System.out.println(ch); // interesting shape
        System.out.println(num1); //0

//        System.out.println(num2); //num2 and bl2 are not static variables, so we cannot use them in static methods
//        System.out.println(bl2);
    }

    public void thirdMethod(){

        System.out.println(number);//20
        System.out.println(name); //null
        System.out.println(bl); //false
        System.out.println(ch); // interesting shape
        System.out.println(num1); //0

        System.out.println(num2); //although num2 and bl2 are not static class level variable, we can still use this class level
        System.out.println(bl2);  //variables for non-static methods.

    }
}

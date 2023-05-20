package day11;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str = "John Doe";

        System.out.println(str.charAt(5));

        checkEvenNumber(22);

        addNumbers(2.3, 45.9);

    }

    //Create a method that checks if a number is even

    public static void checkEvenNumber (int num) {

        boolean bl = num % 2 == 0;
        if(bl){
            System.out.println(num + " is an even number");
        }else {
            System.out.println(num + " is an odd number");
        }

    }

    public static void addNumbers(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Total : " + result);
    }




}

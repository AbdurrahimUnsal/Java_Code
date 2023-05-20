package day10;

public class C09_NestedTernary {
    /*
        take an int number from user
        if it is positive, check if it is an even number
        if it is not a positive number, check if it has 3 digits
         */

    public static void main(String[] args) {

        int number = -1111;
        System.out.println(
                number>0
                        ?
                        number%2 == 0 ? "Even number" : "Odd number"
                        :
                        number > -1000 && number < - 99 ? "3 digits" : " not 3 digits"
        );

    }
}

package day36_date_varargs;
import java.util.Arrays;
public class C09_Varargs {
    public static void main(String[] args) {

        // write a method that can calculate and print sum of numbers
        sum(3,4);
        sum(3,4,5);
        sum(3,4,5,6);
        sum(3,4,5,6,7);
        sum(3,4,5,6,7,8);
        sum(1,2,3,45,6,7,89,10);

    }

    public static void sum(int... a){

        System.out.println(Arrays.toString(a));

        int sum = 0;

        for(int each : a){
            sum = sum + each;
        }

        System.out.println(sum);


    }

      /*
    Java only calls a method if there are suitable gates in the methods
    For example : if there are 2 int parameters in the method, when we call that method. We have to use 2 int numbers:
    otherwise we can not call or use that method
    If we don't know the number of the datatype we are planing to use in the method, we should create a varargs there
    Actually, varargs is an array. it uses array structure.
    If we want to calculate something in the method, we should calculate using array logic
     */


}

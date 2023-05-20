package day36_date_varargs;

public class C10_Varargs {
    public static void main(String[] args) {
        // calculate sum of given numbers then multiply that sum by any given number and print

        multAndSum(4, 1,2,3,4,5,6,7,8,9);//180
    }

    public static void multAndSum(int a, int... b){

        int sum = 0;
        for(int each : b){
            sum += each;
        }

        int result = sum * a;
        System.out.println(result);

    }

    /*
    varargs should be at the end of the parameters, you cannot add another one ofter varargs
    We can not use more than one varargs as parameter. If we do, we will get CTE
    Also, all data  for  the varargs should be the same type
     */
}

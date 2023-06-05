package CodingBat_Practice.Warmup_1;

public class in1020 {
    /*

Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
     */
    public static boolean in1020(int num1, int num2){
        boolean range1 = (num1 >= 10 && num1 <=20);
        boolean range2 = (num2 >=10 && num2 <=20);
        return range1 || range2;

    }

    public static void main(String[] args) {
        int num1 =12;
        int num2 = 99;
        boolean result1 = in1020(num1,num2);
        System.out.println(result1);//true

        num1 = 21;
        num1 = 12;
        boolean result2 = in1020(num1,num2);
        System.out.println(result2);//true

        num1 = 8;
        num2 = 99;
        boolean result3 = in1020(num1,num2);
        System.out.println(result3);//false


    }
}

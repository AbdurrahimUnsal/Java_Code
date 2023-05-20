package CodingBat_Practice.Warmup_1;

public class monkeyTrouble {
    public static void main(String[] args) {
        /*

Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true,
then return true only if both are negative.
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
         */
        System.out.println(posNeg(1,-1,false));
        System.out.println(posNeg(-1,1,false));
        System.out.println(posNeg(-4,-5,true));


    }
    public static boolean posNeg(int a, int b, boolean negative){
        if (negative){
            return (a<0 && b<0);
        }else {
            return ((a<0 && b>0) || (a>0 && b<0));
        }
    }
}

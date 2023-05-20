package day45_exceptions1;

public class C01_TryCatch {


    public static void main(String[] args) {

        int number1 = 20;
        int number2 = 0;

        //try

        try {
            System.out.println(number1/number2);//ArithmeticException
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
            System.out.println("an ArithmeticException is handled....... ");
            //System.out.println(arithmeticException.getMessage());
        }
        //catch(){ }

        System.out.println("********code ended here**************");

    }



}

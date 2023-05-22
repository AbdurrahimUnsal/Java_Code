package day47_exceptions3;

public class C04_FinallyInTryCatch {
    public static void main(String[] args) {

        //After try-catch block if we use finally, no matter what happened before this finally, finally will be executed.

        //1. scenario
        try {
            System.out.println(10/2);
        } catch (Exception e) {
            System.out.println("there is a problem here");
        } finally {
            System.out.println("Final action is done");
        }

        System.out.println("===========================================");

        //2. scenario
        try {
            System.out.println(10/0);//ArithmeticException
        } catch (Exception e) {
            System.out.println("there is a problem here");
        }finally {
            System.out.println("Final action is done");
        }

        System.out.println("===========================================");

        //3. scenario
        try {
            System.out.println(10/2);
        }finally {
            System.out.println("Final action is done");
        }

        System.out.println("===========================================");

        //4. scenario
        try {
            System.out.println(10/0);//ArithmeticException
        }finally {
            System.out.println("Final action is done");
        }


        System.out.println("***Rest of the code***");

    }
}
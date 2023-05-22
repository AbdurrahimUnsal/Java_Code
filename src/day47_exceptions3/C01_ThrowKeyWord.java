package day47_exceptions3;

public class C01_ThrowKeyWord {
    public static void main(String[] args) throws Exception {

        System.out.println("John Doe");

        //How to handle with the exception
        //1) Try-catch blocks
        //2) Throws key word next to method signature NOTE: Throws key word doesn't work to handle manually triggered exception. So, We need to use try-catch

        try {
            throw new RuntimeException("Manually triggered exception");
        } catch (RuntimeException e) {
            System.out.println("Exception happened");
        }

        System.out.println("Ali Can");



    }
}

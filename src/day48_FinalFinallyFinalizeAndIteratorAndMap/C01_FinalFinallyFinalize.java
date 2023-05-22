package day48_FinalFinallyFinalizeAndIteratorAndMap;

public class C01_FinalFinallyFinalize {
    public static void main(String[] args) {
        //Final Key word
        System.out.println(Integer.MIN_VALUE);//-2147483648
        //Integer.MAX_VALUE = 1234; we cannot re-assign a value to the final variable

        System.out.println(Math.PI);

        //Finally

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } finally {
            System.out.println("What ever happens finally block will be run");
        }


        //Finalize(): It is a method to mark unused objects in the memory. Java use this on the background. We don't need to call it.
        //these marked objects. It is an automatic process handled by JVM
        // We can call finalize(), but we do not need to call it.
    }
}

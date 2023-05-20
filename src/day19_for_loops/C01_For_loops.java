package day19_for_loops;

public class C01_For_loops {
    //Question 6- Get a number less than 20 from the user and calculate the factorial value of this number.
    // Also print the configuration of the factorial steps in the console.

    // exp: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

    public static void main(String[] args) {

        int givenNumber = 10;//user input

        long factorial = 1;

        System.out.print(givenNumber+ "! = ");

        for(int i=givenNumber; i>=1; i--){

            factorial = factorial * i;

            if(i==1){
                System.out.print(i);
            }else {
                System.out.print(i + " * ");
            }

        }

        System.out.println(" = " + factorial);

    }

}

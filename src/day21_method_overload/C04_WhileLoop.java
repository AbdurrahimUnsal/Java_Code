package day21_method_overload;

public class C04_WhileLoop {
    public static void main(String[] args) {

        for(int i=1; i<10; i++){
            System.out.print(i + " ");
        }

        System.out.println(); // just to go to next line

        //if we print the numbers form 50 to 100
        //with for loop
        for(int i=50; i<=100; i++){
            System.out.print(i + " ");
        }


        System.out.println();

        //with while loop
        int number = 50;

        while (number<=100){
            System.out.print(number + " ");
            number++;
        }


        //print all even numbers from 50-100 with the while loop
        System.out.println();

        number = 50; //reset the value for second while loop

        while(number<=100){

            if (number%2==0){
                System.out.print(number+ " ");
            }

            number++;
        }

    }



}

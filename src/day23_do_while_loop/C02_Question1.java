package day23_do_while_loop;

public class C02_Question1 {
    //ask user for an int and print the sum of numbers including that integer exp 10 => 1+2+....+9+10
    // use do while loop
    public static void main(String[] args) {
        int startingNumber = 10;
        int sum = 0;

        while(startingNumber<10){

            sum =sum+startingNumber;
            startingNumber++;

        }

        System.out.println("sum of the number from while loop " + sum);

        startingNumber = 10;
        sum = 0;

        do{
            sum = sum + startingNumber;
            startingNumber++;

        }while(startingNumber<10);

        System.out.println("sum of the number from do while loop " + sum);



    }
}

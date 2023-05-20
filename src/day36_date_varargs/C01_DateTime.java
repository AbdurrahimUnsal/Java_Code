package day36_date_varargs;
import java.time.LocalTime;
public class C01_DateTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);//19:18:30.055794100

        // create a loop to calculate sum of numbers starting from 1 to 10000
        // and find how much time it takes.

        LocalTime startingTime = LocalTime.now();
        System.out.println(startingTime.getNano());
        int startingTimeNano = startingTime.getNano();

        int sum = 0;

        for (int i = 0; i < 10000; i++) {

            sum += i;

        }
        System.out.println("Sum of the numbers: " +sum);

        LocalTime endTime = LocalTime.now();
        System.out.println(endTime.getNano());
        int endTimeNano = endTime.getNano();

        System.out.println(endTimeNano-startingTimeNano);





    }
}

package day36_date_varargs;
import java.time.LocalTime;
public class C02_LocalTime {
    public static void main(String[] args) {



        //To set a time, you can use LocalTime.of()
        LocalTime time1 = LocalTime.of(14,15, 30);
        System.out.println(time1); //14:15:30

        //How to manipulate time
        LocalTime time = LocalTime.now();
        System.out.println(time); //20:00:27.584743600

        System.out.println(time.plusHours(2));//22:00:27.584743600
        System.out.println(time.minusHours(2));//18:00:27.584743600

        System.out.println(time.plusMinutes(15));//20:17:47.397004300
        System.out.println(time.minusMinutes(30)); //19:33:39.777304700

        System.out.println(time.plusSeconds(40));//20:05:01.557139500
        System.out.println(time.minusSeconds(300));//20:01:13.459641700

        System.out.println(time.minusHours(10).plusMinutes(30).minusSeconds(30));//10:37:48.597545400

        System.out.println(time.withHour(9));//09:10:14.506404200
        System.out.println(time.withHour(8).withMinute(15).withSecond(30).withNano(12345)); //08:15:30.000012345



    }
}

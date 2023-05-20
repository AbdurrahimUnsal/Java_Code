package day36_date_varargs;
import java.time.LocalTime;
import java.time.ZoneId;
public class C07_LocalTimeZone {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);//21:16:34.331523500

        LocalTime time1 = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(time1);//02:18:57.429714700

        LocalTime time2 = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(time2);//21:18:57.429714700

    }
}

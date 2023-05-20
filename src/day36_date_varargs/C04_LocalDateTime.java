package day36_date_varargs;
import java.time.LocalDateTime;
public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);//2023-05-01T20:40:33.841308700

        System.out.println(dt.toLocalDate());//2023-05-01
        System.out.println(dt.toLocalTime());//20:44:04.429017300

        System.out.println(dt); //2023-05-01T20:44:49.385445300

    }
}

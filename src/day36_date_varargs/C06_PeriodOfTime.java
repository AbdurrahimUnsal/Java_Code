package day36_date_varargs;
import java.time.LocalDate;
import java.time.Period;
public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1984,1,31);
        System.out.println(birthday);//1984-01-31

        LocalDate today = LocalDate.now();
        System.out.println(today);//2023-05-01

        System.out.println(Period.between(birthday, today));//P39Y3M1D
        System.out.println(Period.between(birthday, today).getYears());//39
        System.out.println(Period.between(birthday, today).getDays());//1




    }
}

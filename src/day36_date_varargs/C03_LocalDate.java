package day36_date_varargs;
import java.time.LocalDate;
public class C03_LocalDate {
    public static void main(String[] args) {



        //Setting a specific date fro a LocalDate object
        LocalDate date2 = LocalDate.of(1984, 1,31);


        //How we manipulate the date
        LocalDate date = LocalDate.now();
        System.out.println(date); //2023-05-01

        System.out.println(date.isLeapYear());//false
        System.out.println(date.plusYears(1).plusWeeks(4).plusDays(5));//2024-06-03

        System.out.println(date);//2023-05-01

        System.out.println(date.minusYears(10).minusMonths(3).minusDays(3));//2013-01-29

        System.out.println(date.withYear(1990));//1990-05-01
        System.out.println(date.withYear(1995).withMonth(12));//1995-12-01

        System.out.println(date.getDayOfYear());//121
        System.out.println(date.getDayOfMonth());//1
        System.out.println(date.getMonth());//MAY
        System.out.println(date.getDayOfWeek());//MONDAY

        LocalDate date3 = LocalDate.of(1984, 1,31);

        System.out.println(date.isBefore(date3));//false
        System.out.println(date.isAfter(date3));//true

        //HW: take 2 different people's birthdays then compare them to see who is older


    }
}

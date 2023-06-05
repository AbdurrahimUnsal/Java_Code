package javaCodingPractice;

public class C26 {
    /*
     Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
     */
    public static void main(String[] args) {
        int totalWeeks = 2;
        int daysPerWeek = 3;

        for (int week = 1; week <= totalWeeks; week++) {
            System.out.println("Week: " + week);
            for (int day = 1; day <= daysPerWeek; day++) {
                System.out.println("  Day: " + day);
            }
        }
    }
}

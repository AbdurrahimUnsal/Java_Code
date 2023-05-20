package javaCodingPractice;

public class C18 {
    public static void main(String[] args) {
        /*
        Swap two variable values without using a third variable
         */
        int a = 10;
        int b = 20;

        System.out.println("Değişimden önce:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Değişimden sonra:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

package javaCodingPractice;

public class C24 {
    public static void main(String[] args) {
        int number = 598;
        int sum = 0;

        // Sayının rakamlarının toplamını hesaplama
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Rakamların toplamı: " + sum);
    }
    int sum = 0;

}



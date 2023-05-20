package javaCodingPractice;
public class C16 {
    public static boolean isArmstrongNumber(int number) {
        /*
        Create a method that will accept a number and check if the number is an Armstrong number.
        If the number is an Armstrong number return true otherwise return false.
         */
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, getDigitCount(originalNumber));
            number /= 10;
        }
        return sum == originalNumber;
    }
    private static int getDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int number = 153;
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println(number + " is an Armstrong number: " + isArmstrong);
    }
}

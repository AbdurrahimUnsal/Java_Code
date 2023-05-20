package javaCodingPractice;
public class C15 {
    public static void printPrimeNumbers(int number) {
        /*
        Create a method that will accept a number and print all the prime numbers from 2 to that given number:
         */
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int givenNumber = 150; // Replace with your desired number
        System.out.println("Prime numbers from 2 to " + givenNumber + ":");
        printPrimeNumbers(givenNumber);
    }
}

package javaCodingPractice;

public class C05 {

    public static void main(String[] args) {
        /*
        Create a program that willtake any String and printthe total sum of allthe numbers in the
String. Note: numbers can be more than digits from 1-9 so if you have “14” nextto each other it
should be considered 14 and not 1 and 4 separate:

         */

        String input = "Hello123World45";

        int sum = calculateNumberSum(input);
        System.out.println("Total sum of numbers in the string: " + sum);
    }

    public static int calculateNumberSum(String str) {
        int sum = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else if (currentNumber.length() > 0) {
                sum += Integer.parseInt(currentNumber.toString());
                currentNumber.setLength(0);  // Clear the StringBuilder
            }
        }

        if (currentNumber.length() > 0) {
            sum += Integer.parseInt(currentNumber.toString());
        }

        return sum;
    }


        }

package javaCodingPractice;

public class C12 {
    public static void main(String[] args) {
        /*
        Write a method that can find the maximum number from an int Array
         */
        int[] numbers = {5, 10, 3, 18, 2};
        int maxNumber = findMaximum(numbers);
        System.out.println("Maximum number: " + maxNumber);
    }

    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("The array must not be empty.");
        }

        int max = arr[0]; // Assume the first element is the maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update the maximum if a larger number is found
            }
        }

        return max;
    }
}

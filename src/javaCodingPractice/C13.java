package javaCodingPractice;

public class C13 {
    public static int findMinimum(int[] array) {
        /*
        Write a method that can find the minimum number from an int Array
         */
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        int minimumNumber = findMinimum(numbers);
        System.out.println("Minimum number: " + minimumNumber);
    }
}

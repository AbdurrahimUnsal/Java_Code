package com.company.day30;

public class PlusOne {
    public static void main(String[] args) {

        /*
        [3,2,1]+1 = [3,2,2]
        [1,0,9]+1 = [1,1,0]
        [4,3,2,9]+1 = [4,3,3,0]
        [9] = [1,0]
        You are given a large integer represented as an integer array digits,
        where each digits[i] is the ith digit of the integer.
        The digits are ordered from most significant to least significant in left-to-right order.
        The large integer does not contain any leading 0's.
        Increment the large integer by one and return the resulting array of digits.
         */

    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Increment the least significant digit by one
        digits[n - 1] += 1;

        // Iterate from right to left
        for (int i = n - 1; i > 0; i--) {
            // If the current digit becomes 10, set it to 0 and carry over the 1
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            } else {
                // No carry over, break the loop
                break;
            }
        }

        // If the most significant digit becomes 10, create a new array with one additional digit
        if (digits[0] == 10) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}


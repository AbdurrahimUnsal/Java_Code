package CodingBat_Practice.Array2;

public class fizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];

        for(int i = start; i < end; i++) {
            if(i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if(i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if(i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }

        return arr;
    }
}

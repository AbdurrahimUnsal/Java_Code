package javaCodingPractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class C11 {
    public static void main(String[] args) {
        /*
        Sort Letters and Numbers from alphanumeric String
         */
        String input = "a3b1c5d2e4";
        List<Character> letters = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            } else if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            }
        }

        Collections.sort(letters);
        Collections.sort(numbers);

        System.out.println("Sorted letters: " + letters);
        System.out.println("Sorted numbers: " + numbers);
    }
}

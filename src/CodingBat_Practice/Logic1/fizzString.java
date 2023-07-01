package CodingBat_Practice.Logic1;

public class fizzString {
    public String fizzString(String str) {
        if(str.length() > 0 &&
                str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
            return "FizzBuzz";

        if(str.length() > 0 && str.charAt(0) == 'f')
            return "Fizz";

        if(str.length() > 0 && str.charAt(str.length() - 1) == 'b')
            return "Buzz";

        return str;
    }
}

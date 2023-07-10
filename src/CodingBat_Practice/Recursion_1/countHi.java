package CodingBat_Practice.Recursion_1;

public class countHi {
    public int countHi(String str) {
        if(str.length() < 2)
            return 0;

        if(str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(2));

        return countHi(str.substring(1));
    }
}

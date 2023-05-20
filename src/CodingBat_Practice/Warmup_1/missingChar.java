package CodingBat_Practice.Warmup_1;

public class missingChar {
    /*  Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/
    public static void main(String[] args) {
        //        String str = "Java"; // Jaa
//        int n = 2;

        System.out.println(missingChar("Helikopter", 4)); //Heliopter
    }
    public static String missingChar(String str, int n) {
        //helikopter
        String bastan = str.substring(0,n); //Heli
        String sona = str.substring(n+1); //kopter
        return bastan+sona;
    }
}

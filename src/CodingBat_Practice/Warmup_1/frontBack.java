package CodingBat_Practice.Warmup_1;
/*Given a string, return a new string where the first and last chars have been exchanged.
        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"

 */
public class frontBack {
        public static String frontBack(String str) {
            if (str.length() <= 1) {
                return str;
            }
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);

            return lastChar + middle + firstChar;
        }
        public static void main(String[] args) {
            String result1 = frontBack("code");
            System.out.println(result1);  // Output: eodc

            String result2 = frontBack("a");
            System.out.println(result2);  // Output: a

            String result3 = frontBack("ab");
            System.out.println(result3);  // Output: ba
        }
    }


package CodingBat_Practice.Warmup_1;

public class front22 {
    /*

Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
     */

    public static String front22(String str){
        String front;
        if (str.length()<2){
            front =str;
        }else {
            front = str.substring(0,2);
        }
        return  front + str + front;
    }
    public static void main(String[] args) {
        String str1 = "kitten";
        String result1 = front22(str1);
        System.out.println(result1);//kikittenki

        String str2 = "Ha";
        String result2 = front22(str2);
        System.out.println(result2);//HaHaHa

        String str3 = "abc";
        String result3 = front22(str3);
        System.out.println(result3);//ababcab

    }


}

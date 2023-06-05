package CodingBat_Practice.Warmup_1;

public class delDel {
    /*

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */
    public static String delDel(String str){
        if (str.length()>=4 && str.substring(1,4).equals("del")){
            return str.charAt(0) + str.substring(4);
            }else {
            return str;

        }
    }

    public static void main(String[] args) {
        String str1 = "adelbc";
        String result1 = delDel(str1);
        System.out.println(result1);//abc

        String str2 = "adelHello";
        String result2 = delDel(str2);
        System.out.println(result2);//aHello

        String str3 = "adedbc";
        String result3 = delDel(str3);
        System.out.println(result3);//adedbc

    }

}

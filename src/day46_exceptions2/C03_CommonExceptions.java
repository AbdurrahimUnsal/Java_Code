package day46_exceptions2;

public class C03_CommonExceptions {
    public static void main(String[] args) {
        //NullPointerException
        String str = null;
        System.out.println(str);
//        System.out.println(str.concat("John"));

        //StringIndexOutOfBoundsException
        String str2 = "Java";
//        System.out.println(str2.charAt(6));

        //ArrayIndexOutOfBoundsException
        int[] arr = {3,4,5,6,7};
//        System.out.println(arr[6]);

        //NumberFormatException
        String str3 = "4";
        String str4 = "3k";

//        int sum = Integer.parseInt(str3) + Integer.parseInt(str4);
//        System.out.println(sum);

        //.ClassCastException
        int number1 = 3454;
        Object obj = number1;

//        String numberStr = (String) obj;

    }
}

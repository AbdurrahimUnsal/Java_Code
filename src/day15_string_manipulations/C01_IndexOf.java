package day15_string_manipulations;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Java is very beautiful, very";

        System.out.println(str.indexOf('a')); // 1
        System.out.println(str.indexOf('b')); //13
        System.out.println("very"); //very
        System.out.println(str.indexOf("very"));//8

        String str2 = "very";
        System.out.println(str.indexOf(str2));//8

        System.out.println(str.indexOf(str2, 8));//8
        System.out.println(str.indexOf(str2, 9));//24

        System.out.println(str.indexOf("money"));// -1
        System.out.println(str.indexOf(str2+2+3));// -1
        System.out.println(str.indexOf(str2.concat("beautiful")));// -1

    }
}

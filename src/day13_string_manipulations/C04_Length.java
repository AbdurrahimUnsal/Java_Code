package day13_string_manipulations;

public class C04_Length {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str.length()); //4  // length gives us the number of characters, not index

        String str2 = "şasldkfjşaslkfjaşlsdkfjşklsdjfpweruqpoırupqowerıE";
        //System.out.println(str2.length());  // 60

        //System.out.println(str2.charAt(59));

        System.out.println(str2.charAt(str2.length()-1));

        // null string has 0 length but no index



    }
}

package day37_string_builder;

public class C02_reverse {
    //reverse a sting using StringBuilder class

    public static void main(String[] args) {

        String str = "Java is beautiful";
        System.out.println("String to reverse: " + str); //Java is beautiful

        StringBuilder sb = new StringBuilder(str);
        System.out.println("original sb: " + sb);//Java is beautiful
        System.out.println("reversed sb: " + sb.reverse());//lufituaeb si avaJ

        System.out.println(sb);//lufituaeb si avaJ  StringBuilder is mutable
        System.out.println(str);//"Java is beautiful";  String is immutable

    }
}

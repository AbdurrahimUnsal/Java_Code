package CodingBat_Practice.String_1;

public class makeTags {
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));      // "<i>Yay</i>"
        System.out.println(makeTags("i", "Hello"));   // "<i>Hello</i>"
        System.out.println(makeTags("cite", "Yay"));  // "<cite>Yay</cite>"
    }
}

package CodingBat_Practice.Warmup_2;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));    // Output: pak
        System.out.println(stringYak("pakyak"));    // Output: pak
        System.out.println(stringYak("yak123ya"));  // Output: 123ya
    }

    public static String stringYak(String str) {
        return str.replaceAll("yak", "");
    }
}

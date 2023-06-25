package javaCodingPractice;

public class C31 {
    /*
      Return the lowercase string index i given to you from an even number to uppercase
       */
    public static void main(String[] args) {

        String str = "ankarahavasi";
        for (int i = 0; i < str.length(); i++) {

            String ch = str.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());

            }
        }
    }




}

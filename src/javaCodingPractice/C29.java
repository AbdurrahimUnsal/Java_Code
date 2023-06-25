package javaCodingPractice;

public class C29 {
    public static void main(String[] args) {
        String str = "ankara";
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i,i++);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }
    }
}

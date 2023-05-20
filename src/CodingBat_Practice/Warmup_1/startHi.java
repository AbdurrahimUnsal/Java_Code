package CodingBat_Practice.Warmup_1;

public class startHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise.
    startHi("hi there") → true
    startHi("hi") → true
     startHi("hello hi") → false
     */
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));    // true
        System.out.println(startHi("hi"));          // true
        System.out.println(startHi("hello hi"));    // false
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    // 2.way:  public static void main(String[] args) {
    //
    //        startHi st = new startHi();
    //        System.out.println(st.startHi("hello hi"));
    //
    //    }
    //    public  boolean startHi(String str) {
    //
    //        if(str.startsWith("hi")){
    //            return true;
    //        }
    //        return false;
    //    }

}

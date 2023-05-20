package CodingBat_Practice.Warmup_1;

public class mixStart {

   /*
   Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
    */
   public static void main(String[] args) {
           System.out.println(mixStart("mix snacks"));   // true
           System.out.println(mixStart("pix snacks"));   // true
           System.out.println(mixStart("piz snacks"));   // false
       }

       public static boolean mixStart(String str) {
           if (str.length() < 3) {
               return false;
           }

           String mix = str.substring(1, 3);
           return mix.equals("ix");
       }

   }

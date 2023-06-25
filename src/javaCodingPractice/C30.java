package javaCodingPractice;

public class C30 {
         /*
         Calculate the sum of a number's digits.
         input = 7861;
         output = 22;
         */
         public static void main(String[] args) {
             System.out.println(sumNumber(5769));
         }
         public  static int sumNumber(int a){
             int sum=0;
             while(a>0){
                 int digit = a%10;
                 sum+= digit;
                 a/= 10;
             }
             return sum;
         }

}



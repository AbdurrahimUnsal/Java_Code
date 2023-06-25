package javaCodingPractice;
public class C32 {
        /*
        Write a program that can print the numbers between 1 ~ 200 that can be divisible by 5,9 and 45.
         */
        public static void main(String[] args) {
            int count = 0;
            for (int number = 1; number <=200; number++) {
                if(number%5 == 0 && number%9 == 0 && number%45==0){
                    System.out.println(number);
                    count++;
                }
            }
            System.out.println("count:"+count);
        }
}

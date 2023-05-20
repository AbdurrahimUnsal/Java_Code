package day47_exceptions3;

import java.util.Scanner;

public class C02_ManuallyTriggeredException{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num = scan.nextInt();

        try {
            if (num<0){
                throw new IllegalAccessException("**Manually triggered exception**");
            }
        } catch (IllegalAccessException e){
            System.out.println(e.getMessage());
        }
        System.out.println("=========Rest of the code=======");
    }
}



package day47_exceptions3;

import java.util.Scanner;

public class C03_ManuallyTriggeredException2 {
    public static void main(String[] args) {
        // please ask user to enter their age
        // throw IllegalArgumentException if the age is less than 30
        // Else say age is higher than 30
        //use get message to print the exception message
        //make sure rest of the code works

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        try {
            if(age<30){
                System.out.println("before exception is thrown");
                throw new IllegalArgumentException("###Age is lower than 30###");
            }else {
                System.out.println("age is 30 or more");
            }
            System.out.println("After exception is thrown");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("everything is working fine");
    }
    }


package CodingBat_Practice.String_1;

public class MakeAbba {
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));         // "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));      // "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));       // "WhatUpUpWhat"
    }

}

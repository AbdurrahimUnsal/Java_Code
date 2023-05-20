package com.campany.day22.DogShelter;

import day03.C02_Scanner;

import java.util.Scanner;

public class Main {
  Scanner scanner = new Scanner(System.in);
    public void display(){
        System.out.println("Please select to number in following options");
        int displayNumber = scanner.nextInt();
        System.out.println("1.Add_Dog");
        System.out.println("2.View_AllDog");
        System.out.println("3.View_AllAvailableDog");
        System.out.println("4.View_SearchDog");
        System.out.println("5.Update_DogHomeStatus");
        System.out.println("6.Exit");
    }
    public void displayMenuAction(int menuOption){
        switch (menuOption){

        }
    }


}

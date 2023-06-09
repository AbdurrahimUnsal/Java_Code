package com.company.day22.DogShelter;
import java.util.ArrayList;
import java.util.List;
public class DogShelter {
    private List<Dog> dogList = new ArrayList();


    public void addDog() {
        Dog dogInfo = null;
        for (Dog each : dogList) {
            if (each.getDogId() == dogInfo.getDogId()) {
                System.out.println("WARNING! This dog id is already in our system!!");
            }
        }
        dogList.add(dogInfo);
    }

    public void viewAllDog() {
        for (Dog each : dogList) {
            System.out.println(each.toString());
        }
    }

    public void viewAllAvailableDog() {
        for (Dog each : dogList) {
            if (!each.isDogFoundHome())
                System.out.println(each.toString());
        }
    }

    public void searchDogId() {
        for (Dog each : dogList) {
            int id = 0;
            if (each.getDogId() == id)
                System.out.println(each.toString());
        }

    }

    public void updateHomeStatus() {
        boolean flag = false;
        int id = 0;
        for (Dog each : dogList) {
            if (each.getDogId() == id)
                flag = true;
            each.setDogFoundHome(true);
        }
        if (!flag)
            System.out.println("We do not have a dog with the " + id);
    }
}

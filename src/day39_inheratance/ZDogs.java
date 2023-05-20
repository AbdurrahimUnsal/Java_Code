package day39_inheratance;

public class ZDogs extends Mammals{
    boolean isSharpTeeth = true;

    void dogSound(){
        System.out.println("Dogs bark......");
    }

    public static void main(String[] args) {
        ZDogs newDog = new ZDogs();

        newDog.age =12; // this is coming from Animal class with is a grand-parent of ZDogs class
        newDog.eat(); // it is from the Animal class

        newDog.produceMilkForBaby();//This one comes from Mammals class which is parent of Zdogs
    }
}

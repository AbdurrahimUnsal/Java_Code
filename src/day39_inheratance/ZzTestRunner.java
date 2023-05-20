package day39_inheratance;

public class ZzTestRunner {
    public static void main(String[] args) {

        ZzKangal newKangal = new ZzKangal();

        System.out.println(newKangal.style); // this is coming from the ZzKangal class. class that object is belong to.

        newKangal.age = 13; // Coming from Grand-grand parent which is Animal class
        newKangal.eat(); // Coming from Grand-grand parent which is Animal class
        newKangal.drink(); //Coming from Grand-grand parent which is Animal class

        System.out.println(newKangal.isFur); // Coming from the grandparent which is Mammals class
        newKangal.giveBirth();// Coming from the grandparent which is Mammals class
        newKangal.produceMilkForBaby();// Coming from the grandparent which is Mammals class

        System.out.println(newKangal.isSharpTeeth);// Coming from the parent clas which is ZDog
        newKangal.dogSound();// Coming from the parent clas which is ZDog

        //newKangal.catSound(); // this is coming from  YCats class which is not a parent class for Zzkangal
        //newKangal.spec// this is coming from  YCats class which is not a parent class for Zzkangal


    }
}

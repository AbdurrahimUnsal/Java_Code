package day39_inheratance;

public class Animal {
      /*
    1) Private class items cannot be used by child classes
    2) When default access modifier used for a variable/method, child classes which are under a separate package cannot used it.
    3) When protected access modifier is used, child classes can reach the data even from other packages
    4) When public access modifier is used, child classes can reach the data even from other packages
    5) Static items are not used for child clasess because we don;t create and object to see a static variable or method
    6)A class cannot have multiple parents. It can have only one parents
    7) A class can get as many child as wanted
    8) Sibling classes cannot reach each other's data like parent-child
     */

    int age = 12; // this is a default access modifier variable and it cannot be reached from other packages

    private String  privateStr ="Animal private variable"; // This cannot be reached by child classes

    public void eat(){
        System.out.println("Animal eats....");
    }

    public void drink(){
        System.out.println("Animal drinks");
    }

}

package day33_constructors2;

public class Cat {
    String name;
    int age;

    public Cat(){ //Once we create a constructor java deleted the default
        System.out.println("const with no arg is used");
        name = "Kitkat";
        age = 5;
    }

    public Cat(String label){ // this is another constructor with two parameters
        System.out.println("const with String arg is used");
        name = label;
    }

    public Cat(int yearsOld){
        System.out.println("const with int arg is used");
        age = yearsOld;
    }

    public Cat(String label, int yearsOld){ // this is another constructor with two parameters
        System.out.println("const with String and int arg is used");
        name = label;
        age = yearsOld;
    }

}

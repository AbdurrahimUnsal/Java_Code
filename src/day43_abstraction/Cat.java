package day43_abstraction;

public class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eats...");
    }

    public static void main(String[] args) {

        //Animal newAnimal = new Animal();//'Animal' is abstract; cannot be instantiated. cannoy create object


        Cat newCat = new Cat();
        newCat.eat();
        newCat.drink();

        Dog newDog = new Dog();
        newDog.eat();
        newDog.drink();
    }
}

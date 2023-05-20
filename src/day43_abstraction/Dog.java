package day43_abstraction;

public class Dog extends Animal{
    //public abstract void paw(); // Non-abstract classes cannot have abstract method

    @Override
    public void eat() {
        System.out.println("Dog eats....");
    }
}

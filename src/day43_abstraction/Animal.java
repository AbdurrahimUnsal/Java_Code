package day43_abstraction;

public abstract class Animal {
    /*
    NOTES:
    1) To succeed abstraction we need to use abstract key word for the java class and the methods that be used by child classes
    2) Abstract methods does not have method body
    3) Abstract classes can have both abstract and non-abstract method. Only abstract methods will be forced to child classes\
    4) Abstract methods MUST BE overridden by all immediate CONCRETE (non-abstract) child classes. Abstract sub-classes doesn't have to override abstract methods.
    5) Abstract methods cannot be final and private
    ***StarNote : Objects cannot be created from abstract classes.......
     */

    //abstract method
    public abstract void eat();


    //Non-abstract method
    public void drink(){
        System.out.println("Animal drinks....");
    }
}

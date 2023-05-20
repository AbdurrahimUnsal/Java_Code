package day44_interfaces;

public interface I03_FirstInterface {

    /*
    1) Interface is not class. it is Interface
2) Best feature of an Interface is allowing multiple parents.
3) All methods inside an Interface have to be abstract with no method body, even if abstract key word is not used. (this is r=the reason why Interfaces are called full abstract
4) All Interface methods are public
5) If you want an Interface to be the parent of a class instead of "extends" use "implements"
6) If a class has two parent Interface. Both can have the same name sae return type method. Java will not complain, It will use one of them
        However, if the return types are different, java will complain. It needs to be fixed in Interfaces
7) All variables in Interfaces are public final and static.
8) Like abstract classes, we cannot create objects from Interfaces
9) Interface doesn't have to override from parent Interface
   Abstract class doesn't have to override from parent Interface (Like abstract class doesn't have to override from a parent abstract class)
   ***CONCRETE class has to override from parent Interface
10)     Child                Parent
        Concrete class ==> interface : implements
        Abstract class ==> interface : implements
        Interface      ==> interface : extends
        Interface      ==> Concrete class : This is not allowed in Java. (A class cannot be a parent of an interface)
        Interface      ==> Abstract class : This is not allowed in Java. (A class cannot be a parent of an interface)
     */


    int num =12;

    void method1();
    public  void method2();
    public abstract void method3();
    }


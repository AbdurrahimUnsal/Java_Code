package day40_inheritance2;

public class C06_Corolla extends C05_Toyota{
    int number = 2023;
    String str = "corolla";


    public C06_Corolla(){
        this(15);
        System.out.println("COROLLA class constructor without any parameter");
    }

    public C06_Corolla (int num){
        super();
        System.out.println("COROLLA class constructor with INTEGER parameter");
    }

    public C06_Corolla (String str){
        super();
        System.out.println("COROLLA class constructor with STRING parameter");
    }

    public C06_Corolla (int num, String str){
        super(15);
        System.out.println("COROLLA class constructor with TWO parameter");
    }


    public void method(){
        int number = 20235;
        String str = "method string";
        System.out.println("Corolla method");
        System.out.println(number);//20235
        System.out.println(this.number);//2023
        System.out.println(super.number);//202
        super.method();//Toyota method  20


        System.out.println(str);//method string
        System.out.println(this.str);//corolla
        System.out.println(super.str);//toyota
    }

    public static void main(String[] args) {

        C06_Corolla newCorolla = new C06_Corolla();

        newCorolla.method();

    }

    /*
    Just like Default constructors, java creates super() constructor
    calls when we create parent child relation.
    constructor calls has to be at the first line of the constructors
    so we can not use 2 constructor calls at the same constructor
    When we manually create a constructor, java deletes
    invisible super() const call.
    we can choose different constructor by adding parameters
    to the constructor call.
    we can also call constructors from same class by using this()
    keyword with different arguments
    when we write this(), java will delete invisible super().
     */

}

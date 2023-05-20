package day42_override;

public class BChildClass extends AparentClass{
    String str = "Child";

    //overriding

    @Override
    void method1(){
        System.out.println("Child method1");
    }

    @Override
    void method2() {
        System.out.println("Child method2");
    }

    @Override
    void method3() {
        System.out.println("Child method3");
    }

    public static void main(String[] args) {

        BChildClass child = new BChildClass();
        child.method1();//Child method1
        System.out.println(child.str);//Child


        AparentClass parent = new BChildClass();
        parent.method1();//Child method1
        System.out.println(parent.str);//

    }

           /*
        When we create an object from same datatype class and constructor class
        We take the first one we see
        When the constructor and the datatype are different,
        ---for variable
        go datatype class and we take the first one we see by following parent child realtions
        ----for methods
        go datatype then try to find method. When we find it we should check if it
        is overridden
        if it is overridden it should be in limits (between constructor class and the data
        type class;)
         */

}

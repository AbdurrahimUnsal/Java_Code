package day44_interfaces;

public class C02_ChildClass extends C01_ParentClass implements I03_FirstInterface,I04_SecondInterface{


    @Override
    public void method4() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        System.out.println("Method 2");

    }

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        //I03_FirstInterface obj = new I03_FirstInterface();//'I03_FirstInterface' is abstract; cannot be instantiated //we cannot create object from an interface
        C02_ChildClass childObject = new C02_ChildClass();
        childObject.method2();
        }
    }


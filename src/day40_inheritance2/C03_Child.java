package day40_inheritance2;

public class C03_Child extends C02_Parent{

    String childStr = "This is child string";
    int childInt = 10;

    public C03_Child(){
        super();
        System.out.println("***Child class constructor is used");

    }


    public void childMethod(){
        System.out.println("This child method");
    }

    public static void main(String[] args) {
        C03_Child childObj = new C03_Child();
    }


}

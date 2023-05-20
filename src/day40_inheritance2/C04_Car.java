package day40_inheritance2;

public class C04_Car {
    int number = 20;
    String str = "car";

    public C04_Car (){
        System.out.println("Car class constructor without any parameter");
    }

    public C04_Car (int num){
        System.out.println("Car class constructor with INTEGER parameter");
    }

    public C04_Car (String str){
        System.out.println("Car class constructor with STRING parameter");
    }

    public C04_Car (int num, String str){
        System.out.println("Car class constructor with TWO parameter");
    }


    public void method(){
        System.out.println("Car method");
    }

}

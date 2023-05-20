package day40_inheritance2;

public class C05_Toyota extends C04_Car{
    int number = 202;
    String str = "toyota";

    public C05_Toyota (){
        super();
        System.out.println("TOYOTA class constructor without any parameter");
    }

    public C05_Toyota (int num){
        super("XLE");
        System.out.println("TOYOTA class constructor with INTEGER parameter");
    }

    public C05_Toyota (int... num){
        super("XLE");
        System.out.println("TOYOTA class constructor with INTEGER parameter");
    }

    public C05_Toyota (String str){
        super();
        System.out.println(str + "TOYOTA class constructor with STRING parameter");
    }

    public C05_Toyota (int num, String str){
        super();
        System.out.println("TOYOTA class constructor with TWO parameter");
    }

    public void method(){
        System.out.println("Toyota method");
        System.out.println(super.number);
    }

    public static void main(String[] args) {
        C05_Toyota newToyota = new C05_Toyota(15);
    }
}

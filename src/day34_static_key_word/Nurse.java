package day34_static_key_word;

public class Nurse {
    //Non-static variables
    String nurseName = "Blank nurse name";
    int age;

    //Static variables
    static String hospitalName = "Star medical";
    static int hospitalPhone = 8888888;

    //Non-static method
    public void nonStaticMethod(){
        System.out.println(" nonStaticMethod() is used");
    }

    //static method
    public static void staticMethod(){
        System.out.println("staticMethod() is used");
    }
}

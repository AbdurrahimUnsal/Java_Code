package day34_static_key_word;

public class C01_StaticKeyWord {
    public static void main(String[] args) {

 /*
    1) Static variables are stored in the class. And there will be only one value
    2) Static variables can not be stored in objects
    3) Normaly we do not need to reach a static variable by using the object'name
    but we can reach it by usint the object name
     */

        //Calling **Static** variables and methods
        Nurse.staticMethod();//staticMethod() is used
        System.out.println(Nurse.hospitalName);// Star medical
        System.out.println(Nurse.hospitalPhone);//8888888

        //Calling **Non-static** variables and methods
        Nurse nurse1 = new Nurse();
        System.out.println(nurse1.nurseName);//Blank nurse name
        System.out.println(nurse1.age);//0

        Nurse nurse2 = new Nurse();
        System.out.println(nurse2.nurseName);//Blank nurse name
        System.out.println(nurse2.age);//0

        //Updated nurse1 object non-static variables
        nurse1.nurseName  = "Emily Watson";
        nurse1.age  = 30;
        System.out.println(nurse1.nurseName);//Emily Watson
        System.out.println(nurse1.age);//30

        System.out.println(nurse2.nurseName);//Blank nurse name
        System.out.println(nurse2.age);//0

        //update static variable from class
        Nurse.hospitalName = "Moon medical";
        System.out.println(nurse1.hospitalName);//Moon medical
        System.out.println(nurse2.hospitalName);//Moon medical

        //update static variable from object
        nurse1.hospitalName = "Sun medical";
        System.out.println(nurse1.hospitalName);//Sun medical

        System.out.println(nurse2.hospitalName);//Sun medical

        //call non-static method
        nurse1.nonStaticMethod();//nonStaticMethod() is used

        //call static method from object
        nurse1.staticMethod();//staticMethod() is used


    }
}

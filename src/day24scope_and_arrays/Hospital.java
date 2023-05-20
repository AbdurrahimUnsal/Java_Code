package day24scope_and_arrays;
import java.util.Scanner;
public class Hospital {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ADoctor doctor1 = new ADoctor();

        System.out.println(doctor1.name);

        doctor1.name = "John";
        System.out.println(doctor1.name);// John
        doctor1.lastName= "Doe";
        doctor1.bDay = 1995;
        doctor1.onVocation = false;
        doctor1.phoneNumber = "3456789090";

        ADoctor doctor2 = new ADoctor();
        doctor2.name = "Emily";
        doctor2.lastName = "Kenwood";
        doctor2.bDay= 1968;
        doctor2.onVocation = true;
        doctor2.phoneNumber = "1231231212";

        System.out.println(doctor1.lastName);//Doe
        System.out.println(doctor2.lastName);//Kenwood
        System.out.println(doctor1.bDay);//1995
        System.out.println(doctor2.bDay);//1968
        System.out.println(doctor1.onVocation);//false
        System.out.println(doctor2.onVocation);//true

        doctor1.name = "Mike";  //doctor1 name change will not affect the doctor2
        System.out.println(doctor1.name);//Mike
        System.out.println(doctor2.name);//Emily

        //How we can call static variables


        System.out.println(doctor1.nameOfHospital);  //Star Hospital
        System.out.println(doctor1.hospitalPhoneNumber);

        System.out.println(doctor2.nameOfHospital); //Star Hospital
        System.out.println(doctor2.hospitalPhoneNumber);

        doctor1.nameOfHospital= "Moon Hospital";
        System.out.println(doctor1.nameOfHospital);//Moon Hospital

        System.out.println(doctor2.nameOfHospital);//Moon Hospital

        System.out.println(ADoctor.nameOfHospital);//Moon Hospital
        System.out.println(ADoctor.hospitalPhoneNumber);


        System.out.println(doctor1);






    }

}

package day32_constructors;
import day24scope_and_arrays.ADoctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class C01_Constructors {
    public static void main(String[] args) {

        /*
        An object can be created from a class
        When we want to create an object from a class, the object data type will be the class we created the object
        Constructors will be used create the object from the class
        Constructors features:
        1) They look like methods but they are not method because they don't have return type
        2) Constructors also helps to initiate the values
        3) Cons. will have same name with the class
        4) they can have some args
        5) java has default const that is not visible in every java page
        6)   Important note: ******
                Java will delete the default constructor once we create a new const.
                Also, we must code the default cons. before we start using new const
         */

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        ADoctor doctor1 = new ADoctor();
        ADoctor doctor2 = new ADoctor();
        ADoctor doctor3 = new ADoctor();

        Random random1 = new Random();




    }
}

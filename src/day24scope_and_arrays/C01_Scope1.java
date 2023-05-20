package day24scope_and_arrays;

public class C01_Scope1 {
    //Class level variables can be reached anywhere in the class
    static int classLevelInt = 100;

    public static void main(String[] args) {

        //if you create a variable inside  a method, you can not reach it from outside the method
        String str = "John Doe"; //scope of this method is main method

        System.out.println(str+ classLevelInt); //class level variable can be used anywhere in the class
//        System.out.println(num1); num1's scope is for loop can't be used outside the for loop

        System.out.println();


        for(int i=0; i<10; i++){

            int num1 = i+1;//scope of this is for loop

            System.out.print(str+num1+ classLevelInt + " ");  //class level variable can be used anywhere in the class
        }

        System.out.println();

        method1();


    }


    public static void method1(){

        int num2 = 1990;

        //System.out.println(str);//str's scope is main method. that's why it cannot be used here

        System.out.println("Method1" + num2 + classLevelInt) ; //class level variable can be used anywhere in the class
    }




}

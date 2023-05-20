package day16_string_manipulations;

public class C06_Question2 {
    //Question 2: Collect and print the String prices given by the user in a certain format.

    //input1: “15.31 $” , input2: “11.40 $”   total     //output : 26.71 $

    public static void main(String[] args) {
//          1. Way
        String input1= "15.31 $";
        String input2= "11.40 $";
//
////        double output = null; //I cannot assign null to primitive data type
//        double output = 0;
//
//        input1 =input1.replaceAll("\\D", "");// "1531"
//        input2 =input2.replaceAll("\\D", "");// "1140"
//
//        double inp1 = Double.parseDouble(input1);// 1531.00
//        double inp2 = Double.parseDouble(input2);// 1140.00
//
//        output = (inp1+inp2)/100;
//        System.out.println(output);
//
//        System.out.println("output : " + output + " $");

        // 2. Way
        System.out.println("output : " + stringToDoubleConverter(input1, input2) + " $");

        System.out.println(stringToDoubleConverter("122...ef4ef $$", "444dcdw..,/"));



    }

    //Create a method for the solution
    public static double stringToDoubleConverter(String input1, String input2){

        double output = 0;

        input1 =input1.replaceAll("\\D", "");
        input2 =input2.replaceAll("\\D", "");

        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);

        output = (inp1+inp2)/100;

        return output;

    }


}

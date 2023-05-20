package day02;

public class C01_VariableTypes {
    public static void main(String[] args) {

        double doubleNumber = 2.01234567890123456789d; //it only prints upto 17 numbers
        System.out.println(doubleNumber);

        float floatNumber; // float data type
        floatNumber = 2.01234567890123456789f;
        System.out.println(floatNumber);

        int intNumber = 2; // integer data type
        System.out.println(intNumber);

        // long int = 5; You cannot use key words as variable name
        // int intNum ber = 2;  It should be no space for variable name
        // no special chars for variable name

        boolean myBooleanVariable = false;
        System.out.println(myBooleanVariable);

        char myChar = 'A';
        System.out.println(myChar);

        String text = "Jhon Doe";
        System.out.println(text);





    }
}

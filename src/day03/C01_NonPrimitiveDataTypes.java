package day03;

public class C01_NonPrimitiveDataTypes {
    public static void main(String[] args) {

        int numInt = 2;
        long numLong = 1234;
        char myChar = 'A';

        String myText = "John Doe";

        System.out.println(myText);

        myText = myText.toLowerCase();

        System.out.println(myText);

        String text1 = "A";

        System.out.println(text1 + text1); //concatenation
        System.out.println(text1.concat(text1));

        System.out.println(myChar + myChar);

        String str = "John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe John Doe";


    }
}

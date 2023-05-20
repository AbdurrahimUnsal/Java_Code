package day06;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        int number = 12; // "number" variable doesn't have any ready method to use because it is primitive

        String str = "John Doe";
        System.out.println(str.length());// length() method return integer value for the amount of characters you have

        Integer numberWrapper = 12; // "numberWrapper" variable has some ready methods because it is Non-primitive data type

        System.out.println(Integer.MAX_VALUE);

        byte numberByte = 12;

        Byte byteWrapper = 12;

        System.out.println(byteWrapper+5);//17

        String byteToString = byteWrapper.toString(); //Converting int to string

        System.out.println(byteToString + "5");//125

        System.out.println("Min byte value = " + Byte.MIN_VALUE + "-----" + "Max byte value = " + Byte.MAX_VALUE);

        // Boolean Character Byte Short Integer Long Float Double   all of this are primitive data wrapper classes

        String str2 = "345";

        int intNumber = Integer.parseInt(str2);  //converting string to int

        System.out.println(intNumber + 5);//350

        Double doubleWrapper = 123.987;

        String doubleWrapperString = doubleWrapper.toString();

        System.out.println(doubleWrapperString + 100);

        char chr = 'k';
        Character chrWrapper = 'k';
        System.out.println(chrWrapper.charValue() + 0);


        boolean bl = true;

        Boolean blWrapper = true;

        System.out.println(bl + " string");
        System.out.println(blWrapper.toString() + " string");

        System.out.println(Character.isDigit(chr)); // false
        System.out.println(Character.isLetter(chr)); // true
        System.out.println(Character.isAlphabetic(chr)); //true











    }
}

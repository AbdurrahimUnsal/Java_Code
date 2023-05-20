package day25_arrays;

public class C04_FindDesiredElement {
    //check if the desired element is in the side of an array, create a method for this goal

    public static void main(String[] args) {
        int [] intArray = {2,4,5,3,4,6};
        int desiredNumber= 4;

        printIfArrayHasElement(intArray,desiredNumber);

        String[] strArray= {"Mike", "John", "Emily", "Erick", "John"};
        String desiredStr = "John";

        printIfArrayHasElement(strArray, desiredStr);

    }

    public static void printIfArrayHasElement(int[] intArray, int desiredNumber) {
        int flag = 0;
        for (int i = 0; i <= intArray.length - 1; i++) {
            if (intArray[i] == desiredNumber) {
                flag++;
            }
        }
        System.out.println(flag + " times array has desired " + desiredNumber);
    }


    public static void printIfArrayHasElement(String[] strArray, String desiredStr) {
        int flag = 0;
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].equals(desiredStr)) {
                flag++;
            }
        }
        System.out.println(flag + " times array has desired " + desiredStr);
    }

}

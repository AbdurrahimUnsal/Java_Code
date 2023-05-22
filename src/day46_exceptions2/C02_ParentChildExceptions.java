package day46_exceptions2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class C02_ParentChildExceptions {
    public static void main(String[] args) {


        String filePath = "src/day46_exceptions2/text";
        String WrongFilePath = "src/day46_exceptions2/text2";

        try {
            FileInputStream fis = new FileInputStream(filePath); //this is a checked exception must be handled //FileNotFoundException
            System.out.println("correct file path is used"); //correct file path is used
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
        }


        //1. FileNotFoundException is used
        try {
            FileInputStream fis2 = new FileInputStream(WrongFilePath); //this is a checked exception must be handled //FileNotFoundException
            System.out.println("correct file path is used");
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");//File could not be found
        }

        //2. IOException is used
        try {
            FileInputStream fis3 = new FileInputStream(WrongFilePath); //this is a checked exception must be handled //FileNotFoundException
            System.out.println("correct file path is used");
        } catch (IOException e) {
            System.out.println("File could not be found");//File could not be found
        }

        //2. Exception is used
        try {
            FileInputStream fis4 = new FileInputStream(WrongFilePath); //this is a checked exception must be handled //FileNotFoundException
            System.out.println("correct file path is used");
        } catch (Exception e) {
            System.out.println("File could not be found");//File could not be found
        }
    }

}

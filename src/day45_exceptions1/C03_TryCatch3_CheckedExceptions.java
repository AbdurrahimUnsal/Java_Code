package day45_exceptions1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_TryCatch3_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "src/day45_exceptions1/text1";
        //1.way surround with try-catch
        try {
            FileInputStream fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("handled exception");
            e.printStackTrace();

        }
        //2.way indicate exception in the method signature "throws FileNotFoundException"
        System.out.println("Before");
        FileInputStream fis2 = new FileInputStream(filePath);
        System.out.println("After");
        FileInputStream fis3 = new FileInputStream(filePath);
        System.out.println("codes are ended here");
    }

}

package com.company.day26.fileWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileI01 {


    private static boolean marks;

    public static void main(String[] args) throws IOException {

        File file = new File("src/com/company/day26/fileWork/demo.txt");
        // System.out.println(file.exists());

        List<String> marks = Files.readAllLines(Path.of("src/com/company/day26/fileWork/demo.txt"));
        // System.out.println(marks.toString()); // [Arda,88, Ercan, 100, Serpil, 99, Abdurrahim, 87, Asil, 68, Kursad, 79]

        try {
            marks = Files.readAllLines(Path.of("src/com/company/day26/fileWork/demo.txt"));
            for (String each : marks){
                String name = each.split(",")[0];
                Integer mark = Integer.parseInt(each.split(",")[1]);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("There is some problems!! path is not readable");
        }
        System.out.println(marks);

    }

}

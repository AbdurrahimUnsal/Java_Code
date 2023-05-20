package day27_ArraysAndMDA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C05_MDA {
    public static void main(String[] args) {
        String[][] classes = {{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        //print G
        System.out.println(classes[0][2]);//G

        //Change Q with Y
        classes[2][2] = "Y";

        System.out.println(Arrays.deepToString(classes));

        //calculate the total number of students
        int sum = 0;
        for (int i=0; i<classes.length; i++){
            sum = sum + classes[i].length;
        }
        System.out.println("Total students: " + sum);

        List<String[]> list = new ArrayList<>();
        String[] arr = {"a", "b", "c"};
        list.add(arr);
        System.out.println(Arrays.toString(list.get(0)));


    }
}

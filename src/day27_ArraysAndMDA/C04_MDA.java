package day27_ArraysAndMDA;
import java.util.Arrays;
public class C04_MDA {

    public static void main(String[] args) {

        int[][] intArr = {{3,4,5},{2,3},{1}};//Multi dimensional array

        System.out.println(intArr[0][1]);//4

        System.out.println(Arrays.toString(intArr[0]));//[3, 4, 5]  use Arrays.toString() for the array

        System.out.println(Arrays.deepToString(intArr));//[[3, 4, 5], [2, 3], [1]] use Arrays.deepToString() for MDA array

        System.out.println(Arrays.toString(intArr)); //[[I@1d251891, [I@48140564, [I@58ceff1] prints the references

    }
}

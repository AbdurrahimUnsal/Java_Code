package day28_MDAandList;
import java.util.Arrays;
public class C03_MDA_Q3 {
    public static void main(String[] args) {
        //Question 2- calculate sum of  the elements with the same index in a given 2 dimensional array and
        // assign these sums to a single-layered array that we will create.


        //			input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //			output: [5, 7, 11]

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7},{2,4}};

        //find the shortest element

        int shortestElement = arr[0].length;

        for(int i=0; i<arr.length; i++){
            if(arr[i].length<shortestElement){
                shortestElement = arr[i].length;
            }
        }

        //Create and empty array
        int[] sumArr = new int[shortestElement];

        int sum = 0;

        for (int i=0; i<shortestElement; i++){
            for(int j=0; j<arr.length; j++){
                sum = sum + arr[j][i];
            }
            sumArr[i]= sum;
            sum=0;
        }

        System.out.println(Arrays.toString(sumArr));


    }
}

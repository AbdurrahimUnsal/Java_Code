package day31_arrayList_foreachloop;

public class C03_SumOfSquares {
    public static void main(String[] args) {
        //Question 2- Create a method that takes the squares of each element in the given int array
        // and prints the sum of its squares.

        int [] arr = {3,5,2,3,1,9};
        int[] arr2 = {4, 5,6,7,8,9};

        C05_Finding_common_elements.commonElements(arr, arr2);

        sumOfSquares(arr); //129


    }

    public static void sumOfSquares(int[] arr){

        int sum = 0;
        for (int w: arr) {
            sum = sum + w*w;
        }
        System.out.println("sum of the squares: " + sum);
    }
}

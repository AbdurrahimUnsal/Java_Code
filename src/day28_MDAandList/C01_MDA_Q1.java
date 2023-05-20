package day28_MDAandList;

public class C01_MDA_Q1 {
    public static void main(String[] args) {
        // find how many even numbers are there in the MDA?
        int[][] arr = {{3, 5, 7}, {1, 2, 3, 4}, {1, 2}, {8}};

        int count = 0;

        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j]%2==0) {
                    System.out.print(arr[i][j] + " ");
                    count++;
                }
            }
        }

        System.out.println();

        System.out.println("number of even numbers in the arrays: " + count);


    }
}

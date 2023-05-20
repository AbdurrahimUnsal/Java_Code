package day28_MDAandList;

public class C02_MDA_Q2 {
    public static void main(String[] args) {

        // find numbers these are between 20 and 40 (include borders)

        int[][] arr = {{13, 25, 37}, {41, 12, 23, 34}, {11, 25}, {17}};

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){

                if(arr[i][j]>=20 && arr[i][j]<=40){
                    System.out.print(arr[i][j]+ " ");

                }
            }
        }



    }
}

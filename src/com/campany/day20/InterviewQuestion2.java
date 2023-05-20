package com.campany.day20;
import java.util.Arrays;

public class InterviewQuestion2 {

    public static void main(String[] args) {

        int [] arr = {2,5,10,98,89,54,11};

        int firstBiggest=arr[0];
        int secondBiggest=arr[0];
        int indexNo1=0;
        int indexNo2=0;
        for(int i=0;i<arr.length;i++) {

            if(firstBiggest<arr[i]) {
                firstBiggest=arr[i];
                indexNo1=i;
            }
        }

        for(int i=0;i<arr.length;i++) {

            if(secondBiggest<arr[i] && firstBiggest!=arr[i]) {
                secondBiggest=arr[i];
                indexNo2=i;
            }
        }

        System.out.println(firstBiggest);
        System.out.println(secondBiggest);
        arr[indexNo1] = secondBiggest;
        arr[indexNo2] = firstBiggest;
        System.out.println(Arrays.toString(arr));

    }
}

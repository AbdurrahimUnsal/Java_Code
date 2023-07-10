package javaCodingPractice;

public class C34_Furkan {
    public static void main(String[] args) {
        String [] arr = { "A" , "B" , "C", "B", "A", "A", "C" };
        String desiredString = "C";
        //ExpectedResult = Our Desired String is: A And It Repeats 3 Times in the Array
        //ExpectedResult = Our Desired String is: B And It Repeats 2 Times in the Array
        //ExpectedResult = Our Desired String is: C And It Repeats 2 Times in the Array

        desiredString(arr,desiredString);

    }
    public static void desiredString(String[] newArr, String newString){
        int counter = 0;
        for (int i = 0; i <newArr.length ; i++) {
            if (newArr[i].equals(newString)){
                counter++;
            }

        }
        System.out.println("Our Desired String is: " + newString + " And It Repeats " + counter + " Times in the Array");
    }
}

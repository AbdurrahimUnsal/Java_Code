package day25_arrays;

public class C05_ShortestAndLongestString {
    //Question 6- Create a method that prints the longest and shortest words in a given String array.
    public static void main(String[] args) {

        String[] nameArr= {"John", "Ibrahimovic", "messi", "Ronaldo", "Kaka", "Alex", "Hagi", "Ali", "Su", "Mataramasukokardes"};

        shortestAndLongest(nameArr);

    }

    public static void shortestAndLongest(String[] strArray){
        String longestName = strArray[0];
        String shortestName= strArray[0];

        for (int i=0; i<= strArray.length-1; i++){

            if(strArray[i].length()>longestName.length()){
                longestName= strArray[i];
            }

            if (strArray[i].length()<shortestName.length()){
                shortestName = strArray[i];
            }

        }

        System.out.println("The longest name: " + longestName);
        System.out.println("The shortest name: " + shortestName);

    }
}

package day20_for_loops;

public class C01_For_loops {
    //create a method that takes a string and adds star between the characters and returns a string. exp:Convert "Java" to "J*a*v*a*"

    public static void main(String[] args) {

        System.out.println(starPlacer("java"));



    }

    public static String starPlacer(String str){

        String starredStr ="";

        for(int i = 0; i<str.length(); i++){

            starredStr = starredStr + str.charAt(i) + "*";

        }

        return starredStr;

    }


}

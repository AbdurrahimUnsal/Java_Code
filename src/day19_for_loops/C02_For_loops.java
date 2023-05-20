package day19_for_loops;

public class C02_For_loops {
    //Question 9 (interview)- Ask the user for a String and print the String in reverse.

    public static void main(String[] args) {

        //1.way
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please provide a string");
//        String str = scan.nextLine();
//
//        String revesedStr = "";
//
//        int lastIndex = str.length()-1;
//
//        for (int i = lastIndex;  i>=0; i-- ){
//            revesedStr = revesedStr + str.charAt(i);
//        }
//
//        System.out.println("REVERSED STRING: " + revesedStr);


        String finalSTR = reverseString("JOhnDoe").concat(" RETURNTYPE IS STRING ") ;

        System.out.println(finalSTR);


    }

    //2.Way ---note We are not getting the data from user

    public static String reverseString(String str){

        String reversedStr= "";

        int lastIndex = str.length()-1;

        for(int i=lastIndex; i>=0; i--){
            reversedStr = reversedStr + str.charAt(i);
        }

        return reversedStr;
    }
}

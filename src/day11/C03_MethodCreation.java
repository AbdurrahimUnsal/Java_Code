package day11;

public class C03_MethodCreation {
    public static void main(String[] args) {
        addNumbers(10,20);

        int total = addNumbers2(10,25); // an integer value of 35 assigned to total int variable
        System.out.println(addNumbers2(10,7)); // Method calculates the result and saved in memory as an int
        System.out.println(total); //prints the total int variable value
    }

    //Return type is void
    public static void addNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Total : " + result);
    }

    //Return type is int
    public static int addNumbers2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

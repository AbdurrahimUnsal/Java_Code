package day20_for_loops;

public class C04_Nested_For_loops {

    /*
     *
     * *
     * * *
     * * * *
     */

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            for(int j=1; j<=i; j++ ){
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}

package day23_do_while_loop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        int a = 10;

        //do while loop won't check the condition first. It will check at the end of the first loop
        //so, no matter what the condition is, loop will be executed once
        do{
            System.out.print(a + " ");
            a++;
        } while (a<10);

        a=1;

        System.out.println();

        //While loop will check the condition at the first line, so, if the condition is false, loop won't be executed
        while(a<10){
            System.out.print(a + " ");
            a++;
        }

    }
}

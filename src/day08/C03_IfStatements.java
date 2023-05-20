package day08;

public class C03_IfStatements {
    //Question 4- Get  each lengths of a triangle’s 3 sides from the user,
    // and if the triangle is equilateral, print "Equilateral Triangle".

    public static void main(String[] args) {

        int side1 = 10;
        int side2 = 10;
        int side3 = 10;

        if(side1==side2 && side2==side3 &&  side1>0 ) {
            System.out.println("Equilateral Triangle");

        }



    }
}

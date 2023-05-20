package day10;

public class C06_Ternary {
    //Question 2- Get 3 side lengths of triangle from the user,
    // print “Equilateral triangle” if the triangle is equilateral,
    // otherwise print “Not equilateral”.

    public static void main(String[] args) {

        int side1 = 12;
        int side2 = 12;
        int side3 = 12;

        System.out.println(side1==side2 && side1==side3 && side1>0 ? "Equilateral triangle" : "Not equilateral");



    }
}

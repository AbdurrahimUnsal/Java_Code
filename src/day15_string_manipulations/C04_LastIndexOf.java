package day15_string_manipulations;

public class C04_LastIndexOf {
    public static void main(String[] args) {

        String str = "Java is funny";

        System.out.println(str.lastIndexOf("a")); //2
        System.out.println(str.lastIndexOf('a')); //2
        System.out.println(str.lastIndexOf('a', 2));//1

        System.out.println(str.lastIndexOf('n'));// 11
        System.out.println(str.lastIndexOf('n',10));// 10

        System.out.println(str.lastIndexOf("is"));//5  it will return the index when the match begins

        System.out.println(str.lastIndexOf("Ali"));//-1


    }
}

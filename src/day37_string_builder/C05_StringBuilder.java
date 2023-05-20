package day37_string_builder;
import day38_access_modifier.AccessModifier;
public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Life");


        sb1.delete(4,5);
        System.out.println(sb1);//JavaLife

        sb1.deleteCharAt(7);
        System.out.println(sb1);//JavaLif

        sb1.insert(7, "r");
        System.out.println(sb1);//JavaLifr

        sb1.replace(4, 8, "can");
        System.out.println(sb1); //Javacan




    }
}

package day37_string_builder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        String str  = "Ali Can";
        System.out.println(str);//Ali Can

        //1. way of creating an object from StringBuilder
        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0

        //2. way of creating an object from StringBuilder
        StringBuilder sb2 = new StringBuilder("Ali Can");
        System.out.println(sb2);

        System.out.println(sb2.capacity());//23
        System.out.println(sb2.length());

        sb1.append("YilmazTurk");
        System.out.println(sb1);//YilmazTurk
        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//10

        sb1.append("Mustafa");
        System.out.println(sb1);//YilmazTurkMustafa
        System.out.println(sb1.capacity());//34  34 = 2*16(oldCapacity)+2
        System.out.println(sb1.length());//17

        //2. way of creating an object from StringBuilder

        StringBuilder sb3 = new StringBuilder(7);
        System.out.println(sb3.capacity());//7
        System.out.println(sb3.length());//0

        sb3.append("12345678");
        System.out.println(sb3);//12345678
        System.out.println(sb3.capacity());//16
        System.out.println(sb3.length());//8

        // trimToSize(): to delete unused place by stringBuilder, to save memory

        sb3.trimToSize();
        System.out.println(sb3.capacity());//8
        System.out.println(sb3.length());//8




    }
}

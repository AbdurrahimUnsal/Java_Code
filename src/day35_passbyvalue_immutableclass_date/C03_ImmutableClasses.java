package day35_passbyvalue_immutableclass_date;
import java.util.ArrayList;
import java.util.List;
public class C03_ImmutableClasses {
    public static void main(String[] args) {

        //String and wrapper classes are immutable so, whatever we do we cannot change the original value

        /*
        When we create an object from a class it could be mutable or immutable
        String -- immutable
        StringBuilder -- mutable
        StringBuffer -- mutable
        -if we use immutable class to create an object. The object will be immutable
        -as long as new value is *not assigned immutable data original value cannot be changed
        - even if you use a method
        -everytime we use a method onm immutable object, Java creates a new object
        --unused objects are cleaned by java using garbage collector
         */

        //Amr's summary
        /*
         In general, immutable objects are preferred in Java because they are thread-safe and can be shared more easily
         between different parts of a program without worrying about unexpected changes to their state.
         However, mutable objects can be useful in situations where performance is a concern and frequent modifications to the object are required
         */

        String str = "Java is getting funnier everyday";

        str.substring(5);
        str.substring(10, 12);
        str.startsWith("java");
        str.toLowerCase();
        str.toLowerCase();


//        str = str.toUpperCase();//JAVA IS GETTING FUNNIER EVERYDAY
//        str = str.substring(5);//IS GETTING FUNNIER EVERYDAY
        System.out.println(str);//Java is getting funnier everyday

        //To change an immutable variable we need to assign it to new value.


        List<Integer> numbers  = new ArrayList<>(); //[]
        System.out.println(numbers);//[]

        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers);//[5, 9]

        numbers.set(0,7);
        numbers.remove(1);

        System.out.println(numbers);//[7]

        //Whitout any assignment, just usinng a method we are able chage the original value
        //this means the data is mutable



    }
}

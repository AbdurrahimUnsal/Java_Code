package day30_arrayList3;
import java.util.ArrayList;
import java.util.List;
public class C05_ChangingThePlacesOfListElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(33);
        System.out.println(numbers);//[3, 6, 7, 8, 33]

        int tempElementValue = numbers.get(1); //6 saved in temp box to not to lose it

        numbers.set(1, numbers.get(3));
        System.out.println(numbers); //[3, 8, 7, 8, 33]

        numbers.set(3, tempElementValue);
        System.out.println(numbers); //[3, 8, 7, 6, 33]

    }
}

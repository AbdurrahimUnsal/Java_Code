package day52_collections3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C02_CollectionsAnswer {
    public static void main(String[] args) {
        List<Integer> list1 = createListFromUser();
        List<Integer> list2 = createListFromUser();

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements: " + commonElements);
    }

    public static List<Integer> createListFromUser() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for the list (press 0 to finish):");
        int value;
        do {
            value = scanner.nextInt();
            if (value != 0) {
                list.add(value);
            }
        } while (value != 0);

        return list;
    }

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        for (Integer element : list1) {
            if (list2.contains(element)) {
                commonElements.add(element);
            }
        }
        return commonElements;
    }
}

package day30_arrayList3;

public class C03_CallingMethodFromAnotherClass2 {
    // if number of dividers is higher than 10 print "beautiful" for a given number
    // if not, print "baad"

    public static void main(String[] args) {

        int number = 120; // the given number

        System.out.println(C02_Question1.positiveDividers(number));

        int amountOfDividers = C02_Question1.positiveDividers(number).size();
        System.out.println(amountOfDividers);

        if (amountOfDividers>10){
            System.out.println("beautiful");
        } else{
            System.out.println("baad");
        }

    }
}

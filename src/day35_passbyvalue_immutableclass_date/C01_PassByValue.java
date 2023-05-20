package day35_passbyvalue_immutableclass_date;

public class C01_PassByValue {
    public static void main(String[] args) {

        double price  =  200;

        discounted10(price);//10% discounted price is: 180.0
        System.out.println(price);//200.0 which is the original value
        discounted25(price);//25% discounted price is: 150.0
        System.out.println(price);//200.0 which is the original value
        System.out.println("We used 2. 25% discount method: " + discounted25method2(price));
        System.out.println(price);//200.0 which is the original value

        price = discounted25method2(price);
        System.out.println(price);//150.0

    }

    public static void discounted10(double prc) {
        prc = 200 * 0.9;
        System.out.println("10% discounted price is: " + prc);
    }

    public static void discounted25(double prc) {
        prc = 200 * 0.75;
        System.out.println("25% discounted price is: " + prc);
    }

    public static double discounted25method2(double prc) {
        prc = 200 * 0.75;
        return prc;
    }



}

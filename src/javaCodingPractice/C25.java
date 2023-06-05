package javaCodingPractice;

public class C25 {
    /*
    //Ornek 2: Hic sayi kullanmadan 1 den 100 e kadar olan sayilari console a yazdiriniz
     */
    public static void main(String[] args) {
        printNumbers(1, 100);
    }

    public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.print(start );
            printNumbers(start + 1, end);
        }
    }
}

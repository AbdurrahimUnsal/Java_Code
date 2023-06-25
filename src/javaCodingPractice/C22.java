package javaCodingPractice;

public class C22 {
    public static void main(String[] args) {
        //Ornek 2 :   Size verilen kucuk harfle yazilmis Stringini index i cift sayi olan characterlerini buyuk harfe dondur
        //ankara ==> AKR
        String str = "ankarahavasi";
        for (int i = 0; i < str.length(); i++) {

            String ch = str.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());

            }
        }
    }
}


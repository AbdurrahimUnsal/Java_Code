package javaCodingPractice;

public class C21 {
    public static void main(String[] args) {
        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz


        for (int i = 21; i <=180 ; i++) {
            if (i%2==0 && i%3==0){
                System.out.print(i+ " ");
            }



        }
        System.out.println("===============");

        //Ornek 2 :   Size verilen kucuk harfle yazilmis Stringini index i cift sayi olan characterlerini buyuk harfe dondur
        //ankara ==> AKR
        String str = "ankara";
        for (int i = 0; i < str.length(); i++) {

            String ch = str.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());

            }

        }

        //Onek 3 :

        String s1 = "I Love Java";
        for (int i = 0; i < s1.length(); i++) {
            char ch =s1.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        // Ornek 4;



        }

    }




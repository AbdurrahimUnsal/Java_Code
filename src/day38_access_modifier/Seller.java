package day38_access_modifier;

public class Seller {
    public static void main(String[] args) {

        EncapsulationPersonel pers01  = new EncapsulationPersonel();

        //getters
        System.out.println(pers01.getPersonelSumIncome());//0
        System.out.println(pers01.getSellerSoldProductIncome());//0
        System.out.println(pers01.isHoliday());//true

        //setters
        pers01.setPersonelSumIncome(10);
        System.out.println(pers01.getPersonelSumIncome());

        pers01.setSellerSoldProductIncome(20);
        System.out.println(pers01.getSellerSoldProductIncome());//20

        pers01.setHoliday(false);
        System.out.println(pers01.isHoliday());//false

        EncapsulationPersonel pers02  = new EncapsulationPersonel();
        System.out.println(pers02.getPersonelSumIncome());//0
        System.out.println(pers02.getSellerSoldProductIncome());//0
        System.out.println(pers02.isHoliday());//true



    }
}

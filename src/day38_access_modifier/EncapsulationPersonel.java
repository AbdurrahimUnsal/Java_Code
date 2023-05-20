package day38_access_modifier;

public class EncapsulationPersonel {
      /*
    How to achieve encapsulation:
    1) Use **private access modifier for the variables that you want o use for encapsulation
    2) Create getters method for the variable you wanted it to be read from other classes
    3) Create setters method for the variable you wanted it to updated from other classes
     Q: How do we decide the return type of getters and setters
     getters return type is coming from the variable, so it is same as its variable
     setters doesn't have a return type it will be void method.
     */



    private int personelSumIncome = 0;
    private int sellerSoldProductIncome = 0;
    private boolean holiday = true;


    public int getPersonelSumIncome(){
        return personelSumIncome;
    }

    public int getSellerSoldProductIncome() {
        return sellerSoldProductIncome;
    }

    public boolean isHoliday() {
        return holiday;
    }

    public void setPersonelSumIncome(int personelSumIncome) {
        this.personelSumIncome = personelSumIncome;
    }

    public void setSellerSoldProductIncome(int sellerSoldProductIncome) {
        personelSumIncome = personelSumIncome + sellerSoldProductIncome;
        this.sellerSoldProductIncome = sellerSoldProductIncome;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }
}

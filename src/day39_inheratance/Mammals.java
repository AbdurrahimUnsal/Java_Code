package day39_inheratance;

public class Mammals extends Animal{
    Boolean isFur = true;

    public void giveBirth(){
        System.out.println("Mammal gives birth");
    }

    public void produceMilkForBaby(){
        System.out.println("Mammals produce milk for their babies");
    }

    public static void main(String[] args) {

        Mammals newMammals = new Mammals();

    }
}

package day39_inheratance;

public class ZzKangal extends ZDogs{
    String style = "Shepperd dog ";

    public static void main(String[] args) {
        ZzKangal newKangal = new ZzKangal();

        newKangal.style = "BIg Shepperd dog ";
        newKangal.age = 10; // coming from grand grand parent

    }
}

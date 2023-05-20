package day47_exceptions3;

public class C04_FinallyInTryCatch {
    public static void main(String[] args) {

        //1.scenario
        try {
            System.out.println(10 / 2);
        } catch (Exception e) {
            System.out.println("there is a problem here");
        } finally {
            System.out.println("Final action is done");
        }
        System.out.println("=======================");
        //2.scenario
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("there is a problem here");
        } finally {
            System.out.println("Final action is done");
        }
    }
}
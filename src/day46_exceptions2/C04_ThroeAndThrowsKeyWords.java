package day46_exceptions2;
import java.io.IOException;
public class C04_ThroeAndThrowsKeyWords {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello World. I know Java now");

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("After exception");
    }
}

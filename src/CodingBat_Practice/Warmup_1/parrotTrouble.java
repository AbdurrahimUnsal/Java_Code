package CodingBat_Practice.Warmup_1;

public class parrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour){
        return (talking && (hour < 7 || hour > 20));

    }

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true,6));
        System.out.println(parrotTrouble(true,7));
        System.out.println(parrotTrouble(false, 6));
    }
}

package CodingBat_Practice.Logic2;

public class makeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int remainder = goal >= (5 * big) ? goal - (5 * big) : goal % 5;

        return small >= remainder;
    }
}

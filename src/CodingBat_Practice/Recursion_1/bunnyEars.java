package CodingBat_Practice.Recursion_1;

public class bunnyEars {
    public int bunnyEars(int bunnies) {
        if(bunnies == 0)
            return 0;

        return 2 + bunnyEars(bunnies - 1);
    }
}

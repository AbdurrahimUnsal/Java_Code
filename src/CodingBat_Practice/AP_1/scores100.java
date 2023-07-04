package CodingBat_Practice.AP_1;

public class scores100 {
    public boolean scores100(int[] scores) {
        for(int i = 0; i <= scores.length - 2; i++) {
            if(scores[i] == 100 && scores[i+1] == 100)
                return true;
        }

        return false;
    }
}

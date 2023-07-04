package CodingBat_Practice.AP_1;

public class scoresClump {
    public boolean scoresClump(int[] scores) {
        for(int i = 0; i <= scores.length - 3; i++) {
            if(scores[i+2] - scores[i] <= 2)
                return true;
        }

        return false;
    }
}

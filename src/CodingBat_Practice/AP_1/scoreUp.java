package CodingBat_Practice.AP_1;

public class scoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for(int i = 0; i < key.length; i++) {
            if(key[i].charAt(0) == answers[i].charAt(0)) {
                score += 4;
            } else if(answers[i].charAt(0) != '?') {
                score -= 1;
            }
        }

        return score;
    }
}

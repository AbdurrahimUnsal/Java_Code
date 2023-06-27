package CodingBat_Practice.Logic1;

public class coughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday) {
            if(speed <= 65) {
                return 0;
            } else if(66 <= speed && speed <= 85) {
                return 1;
            } else if(86 <=  speed) {
                return 2;
            }
        }

        if(speed <= 60) {
            return 0;
        } else if(61 <= speed && speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }
        }

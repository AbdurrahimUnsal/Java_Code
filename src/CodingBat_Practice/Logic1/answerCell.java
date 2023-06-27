package CodingBat_Practice.Logic1;

public class answerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep)
            return false;

        if(isMorning && !isMom)
            return false;

        return true;
    }
}

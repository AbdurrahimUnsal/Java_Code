package CodingBat_Practice.AP_1;

public class commonTwo {
    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int aIndex = 0;
        int bIndex = 0;

        if(a[0].equals(b[0])) {
            count++;
            aIndex++;
            bIndex++;
        } else if(a[0].compareTo(b[0]) < 0) {
            aIndex++;
        } else {
            bIndex++;
        }

        while(aIndex < a.length && bIndex < b.length) {
            if(aIndex > 0 && a[aIndex-1].equals(a[aIndex])) {
                aIndex++;
            } else if(a[aIndex].equals(b[bIndex])) {
                count++;
                aIndex++;
                bIndex++;
            } else if(a[aIndex].compareTo(b[bIndex]) < 0) {
                aIndex++;
            } else {
                bIndex++;
            }
        }

        return count;
    }
}

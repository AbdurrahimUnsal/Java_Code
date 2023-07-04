package CodingBat_Practice.AP_1;

public class wordsFront {
    public String[] wordsFront(String[] words, int n) {
        String[] arr = new String[n];

        for(int i = 0; i < arr.length; i++)
            arr[i] = words[i];

        return arr;
    }
}

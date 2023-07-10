package CodingBat_Practice.AP_1;

public class wordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals(target))
                count++;
        }

        String[] arr = new String[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(!words[i].equals(target)) {
                arr[index] = words[i];
                index++;
            }
        }

        return arr;
    }
}

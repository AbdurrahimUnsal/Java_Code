package javaCodingPractice;

public class C02 {
    public static int countJavaOccurrences(String str) {
/*
Write a program that will count how many times “java”is found in any given String:
 */
        int count = 0;
        int index = 0;
        while (true) {
            index = str.indexOf("java", index);
            if (index != -1) {
                count++;
                index += "java".length();
            } else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "how do i write in java";
        int occurrences = countJavaOccurrences(input);
        System.out.println("Word 'java' " + occurrences + " times found.");
    }
    }

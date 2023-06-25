package com.company.day29;

public class C01_ExcelTable {
    public static void main(String[] args) {
        System.out.println(excelToNumber("A")); //1
        System.out.println(excelToNumber("B")); // 2
        System.out.println(excelToNumber("Z")); // 26
        System.out.println(excelToNumber("AA")); // 27
        System.out.println(excelToNumber("AZ")); // 52
        System.out.println(excelToNumber("ABC")); // 731
        System.out.println(excelToNumber("ZY")); // 701
        System.out.println(excelToNumber("AAA")); // 703
        System.out.println(excelToNumber("AZY")); // 1377
        System.out.println(excelToNumber("ABCD")); // 19010
        System.out.println(excelToNumber("BB")); // 54
        System.out.println(excelToNumber("BA")); // 53
    }
        public static int excelToNumber(String columnTitle) {
            int result = 0;
            int n = columnTitle.length();

            for (int i = n - 1; i >= 0; i--) {
                char c = columnTitle.charAt(i);
                int value = c - 'A' + 1;
                result += value * Math.pow(26, n - i - 1);
            }

            return result;
        }
    }




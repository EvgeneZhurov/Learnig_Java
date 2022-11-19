//https://leetcode.com/problems/roman-to-integer/
// начало 11-30 26.10.2022
// конец 14-00 26.10.2022

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XIII";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int result = 0;
        int num = 0;
        int m = s.length();




        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;

            }
            if (num * 4 > result) {
                result = result + num;
            } else {
                result = result - num;
            }
        }

        return result;
    }
}

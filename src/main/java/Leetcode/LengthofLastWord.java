package Leetcode;

public class LengthofLastWord {
    public static void main(String[] args) {

        String s = "luffy is still joyboy";
        String[] words = s.split(" ");

        System.out.println(LastWord(s));


    }
        //подсчет кол-ва символов в последнем слове
        public static int LastWord(String s) {

        String[] words = s.split(" ");
        String result = words[words.length-1];
        return result.length();

    }
}

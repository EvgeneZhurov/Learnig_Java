package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

        long m = System.currentTimeMillis();

        System.out.println(genParenthesis(3));
        System.out.println(m);}
    
    public static List<String> genParenthesis(int n) {
        List<String> result = new ArrayList<>();
        for (int i = (int) Math.pow(2, (2 * n - 1)); i < Math.pow(2, (double) n * 2); i++) {
            String num = Integer.toString(i, 2);
            String num2 = num;
            String num5 = num2.substring(num2.length() - 1);
            if (num5.indexOf("1") != -1) {
                continue;
            }

            while (num2.length() != 0) {

                if (num2.substring(num2.length() - 1).indexOf("1") != -1) {
                    break;
                }
                int num4 = num2.length();
                if (num2.indexOf("10") == 0) {
                    num2 = num2.substring(2);
                    if (num2.length() == 0) {
                        result.add(num);
                        break;
                    }
                    continue;
                } else if (num2.indexOf("10") == num2.length() - 2) {
                    num2 = num2.substring(0, num2.indexOf("10"));
                    if (num2.length() == 0) {
                        result.add(num);
                        break;
                    }
                    continue;
                } else if (num2.substring(num2.length() - 2).indexOf("10") != -1) {
                    num2 = num2.substring(0, num2.length() - 2);
                    if (num2.indexOf("1") != -1) {
                        if (num2.length() == 0) {
                            result.add(num);
                            break;
                        } else {
                            continue;
                        }
                    }
                } else if (num2.indexOf("10") != -1) {
                    num2 = num2.substring(0, num2.indexOf("10")) + num2.substring(num2.indexOf("10") + 2);
                    if (num2.length() == 0) {
                        result.add(num);
                        break;
                    }
                }
                if (num2.length() == 0) {
                    result.add(num);
                    break;
                }
                if (num2.length() == num4) {
                    break;
                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            String replacement = result.get(0);


            for (int j = 0; j < replacement.length(); j++) {
                String replacement1 = String.valueOf(replacement.charAt(j));
                if (replacement1.indexOf("1") != -1) {
                    if (j == 0) {
                        replacement = "(" + replacement.substring(1);

                    } else {
                        replacement = replacement.substring(0, j) + "(" + replacement.substring((j + 1));

                    }
                }
                if (replacement1.indexOf("0") != -1) {
                    if (j == 0) {
                        replacement = ")" + replacement.substring(1);

                    } else {
                        replacement = replacement.substring(0, j) + ")" + replacement.substring((j + 1));

                        if (j == replacement.length() - 1) {
                            result.add(replacement);
                            result.remove(0);
                        }
                    }
                }
            }
        }
        System.out.println(result.size());
        return result;
    }
}

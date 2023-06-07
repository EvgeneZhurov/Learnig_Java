package lessons;

import java.util.HashSet;
import java.util.Set;

public class LongPressedName {
    public static void main(String[] args) {

        String name = "alex";
        String typed = "aaleex";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }
        Set<String> dubles = new HashSet<>();
        Set<String> notdubles = new HashSet<>();

        if (name.charAt(0) != typed.charAt(0)) {
            return false;
        }
        if ((name.charAt(0) == typed.charAt(0)) && typed.charAt(0) == typed.charAt(1)) {
            dubles.add(String.valueOf(typed.charAt(0)));
        }


        System.out.println(dubles);


        return false;
    }
}

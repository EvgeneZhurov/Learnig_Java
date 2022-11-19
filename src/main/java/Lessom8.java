
public class Lessom8 {
    public static void main(String[] args) {

        System.out.println(consolidateStr("раз", "два", "три"));

    }

    public static String consolidateStr(String... str) {

        String result = "";

        for (String val : str) {
            result = result.concat(" ");
            result = result.concat(val);
        }

        return result;
    }
}

package courses.priority;

public class Symbols {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("а <в >с &д");

        changeSymbol(stringBuilder);

        System.out.println(stringBuilder);
    }

    public static void changeSymbol(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {
          char temp = stringBuilder.charAt(i);

            if (temp == '<') {
                stringBuilder.delete(i, i + 1);
                stringBuilder.insert(i,"&lt;");
            }

            if (temp == '>') {
                stringBuilder.delete(i, i + 1);
                stringBuilder.insert(i,"&gt;");
            }

            if (temp == '&') {
                stringBuilder.delete(i, i + 1);
                stringBuilder.insert(i,"&amp;");
            }
        }
    }
}

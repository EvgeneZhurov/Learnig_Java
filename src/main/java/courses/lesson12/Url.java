package courses.lesson12;

public class Url {
    public static void main(String[] args) {
        String url = "http://SomeServerName";

        System.out.println("Имя сервера: " + getServerName(url));
    }

    public static String getServerName(String url) {
        if (url.isEmpty()) {
            return "";
        }

        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.indexOf("/", startIndex);

        if (endIndex == -1) {
            return url.substring(startIndex);
        }

        return url.substring(startIndex, endIndex);
    }
}

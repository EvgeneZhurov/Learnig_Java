public class Lesson17 {

    public static class File {

        public String name;
        public int size;
        public Type fileType;

        public File(String name, int size, Type type) {

            this.name = name;
            this.size = size;
            fileType = type;
        }

        public String getName() {
            return name;
        }
    }
}

enum Type {
    TXT,
    MKV,
    PDF,
    MP3
}
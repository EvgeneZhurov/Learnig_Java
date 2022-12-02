import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Lesson17.File file1 = new Lesson17.File("File1", 5, Type.TXT);
        Lesson17.File file2 = new Lesson17.File("File2", 4, Type.MKV);
        Lesson17.File file3 = new Lesson17.File("File3", 3, Type.PDF);
        Lesson17.File file4 = new Lesson17.File("File4", 2, Type.MP3);

        Lesson17.File[] array = new Lesson17.File[]{file1, file2, file3, file4};

        Scanner scanner = new Scanner(System.in);
        String index = scanner.nextLine();

        displayInfo(foundFile(index, array));
    }

    public static Lesson17.File foundFile(String index, Lesson17.File[] array) throws FileNotFoundException {

        boolean isFalse = false;

        Lesson17.File fileComparison = array[0];
        for (int i = 0; i < array.length; i++) {
            fileComparison = array[i];
            if (Objects.equals(index, fileComparison.getName())) {
                isFalse = true;
                break;
            }
        }

        if (!isFalse) {
            throw new FileNotFoundException();
        }
        return fileComparison;
    }

    public static void displayInfo(Lesson17.File file) {
        System.out.printf("File name: %s\tРазмер: %d\tТип %s\n", file.name, file.size, file.fileType);
    }
}

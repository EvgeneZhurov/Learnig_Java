import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Lesson17.File file1 = new Lesson17.File("File1", 5, Lesson17.File.Type.TXT);
        Lesson17.File file2 = new Lesson17.File("File2", 4, Lesson17.File.Type.MKV);
        Lesson17.File file3 = new Lesson17.File("File3", 3, Lesson17.File.Type.PDF);
        Lesson17.File file4 = new Lesson17.File("File4", 2, Lesson17.File.Type.MP3);

        Lesson17.File[] array = new Lesson17.File[]{file1, file2, file3, file4};

        Scanner scanner = new Scanner(System.in);
        String index = scanner.nextLine();

        foundFile(index, array);
    }

    public static void foundFile(String index, Lesson17.File[] array) throws FileNotFoundException {

        boolean isFalse = false;

        Lesson17.File fileComparison;
        for (int i = 0; i < array.length; i++) {
            fileComparison = array[i];
            if (Objects.equals(index, fileComparison.getName())) {
                fileComparison.displayInfo();
                isFalse = true;
            }
        }

        if (isFalse == false) {
            throw new FileNotFoundException();
        }
    }
}

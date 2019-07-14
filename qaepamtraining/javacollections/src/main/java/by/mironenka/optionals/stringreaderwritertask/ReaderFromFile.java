package by.mironenka.optionals.stringreaderwritertask;

//1.   Ввести строки из файла, записать в список.
// Вывести строки в файл в обратном порядке.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderFromFile {

    private final List<String> stringsFromFileList;
    private final File file;
    private Scanner scanner;

    public ReaderFromFile(String fileName) {
        this.stringsFromFileList = new ArrayList<String>();
        this.file = new File(fileName);
    }

    public List<String> getListWithStringsFromFile() {
        return stringsFromFileList;
    }

    public File getFile() {
        return file;
    }

    public void readFromFileAndWriteToList() throws FileNotFoundException {

        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            stringsFromFileList.add(scanner.nextLine());
        }
    }
}

package by.mironenka.taskone.readerNumbersFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderNumbersFromFile {

    private final List<String> stringsFromFileList;
    private final List<Integer> integersFromFileList;
    private final File file;
    private Scanner scanner;

    public ReaderNumbersFromFile(String fileName) {
        this.stringsFromFileList = new ArrayList<String>();
        this.integersFromFileList = new ArrayList<Integer>();
        this.file = new File(fileName);
    }

    public List<Integer> getIntegersFromFileList() {
        return integersFromFileList;
    }

    public List<String> getStringsFromFileList() {
        return stringsFromFileList;
    }

    public File getFile() {
        return file;
    }

    public void readFromFileAndWriteToList() throws FileNotFoundException {

        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            int temp = Integer.parseInt(scanner.nextLine());
            integersFromFileList.add(temp);
            System.out.println(temp);
        }
    }


}

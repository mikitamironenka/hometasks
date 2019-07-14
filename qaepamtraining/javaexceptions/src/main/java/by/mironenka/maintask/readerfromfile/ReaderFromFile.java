package by.mironenka.maintask.readerfromfile;

import by.mironenka.maintask.customexceptions.IncorrectFileNameException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderFromFile {

    private final List<String> stringsFromFileList;
    private final String fileName;

    public ReaderFromFile(String fileName) {
        this.stringsFromFileList = new ArrayList<String>();
        this.fileName = fileName;
    }

    public List<String> getListWithStringsFromFile() {
        return stringsFromFileList;
    }


    public void readFromFileAndWriteToList() {

        try ( Scanner scanner = new Scanner(new File(fileName)) )
        {
            while (scanner.hasNextLine()) {
                stringsFromFileList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException err) {

            if (!isCorrectFileName(fileName)) {
                try {
                    throw new IncorrectFileNameException("Incorrect filename : " + fileName , err);
                } catch (IncorrectFileNameException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private boolean isCorrectFileName(String fileName) {

        File file = new File(fileName);

        try {

            return file.getCanonicalFile().getName().equals(file);

        } catch (IOException e) {
            return false;
        }
    }
}

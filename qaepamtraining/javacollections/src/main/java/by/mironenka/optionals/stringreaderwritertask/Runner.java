package by.mironenka.optionals.stringreaderwritertask;

import java.io.IOException;
import java.util.List;

public class Runner {

    private static String fileName = System.getProperty("user.dir") + "\\javacollections\\src\\main\\java\\by\\mironenka\\optionals\\stringreaderwritertask\\file.txt";
    private static String fileNameToWrite = System.getProperty("user.dir") + "\\javacollections\\src\\main\\java\\by\\mironenka\\optionals\\stringreaderwritertask\\fileToWrite.txt";

    public static void main(String[] args) throws IOException {

        ReaderFromFile readerFromFile = new ReaderFromFile(fileName);
        WriterToFile writerToFile = new WriterToFile(fileNameToWrite);

        readerFromFile.readFromFileAndWriteToList();
        readerFromFile.getListWithStringsFromFile();

        printLines(readerFromFile.getListWithStringsFromFile());

        writerToFile.writeStringsToFileFromList(readerFromFile.getListWithStringsFromFile());
    }


    public static void printLines(List<String> list) {

        for(String line : list){
            System.out.println(line);
        }
    }

}

package by.mironenka.taskone;
//Задание.
// Выполнить указанные действия по чтению информации из файла,
// ее обработке и записи в файл. При разработке для вывода результатов
// создавать новую директорию и файл средствами класса File.
//1.Создать и заполнить файл случайными целыми числами.
// Отсортировать содержимое файла по возрастанию.

import by.mironenka.taskone.readerNumbersFromFile.ReaderNumbersFromFile;
import by.mironenka.taskone.sorter.Sorter;
import by.mironenka.taskone.writernumberstofile.WriterNumbersToFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {

        List<Integer> integers = new ArrayList<Integer>();
        //create new directory and file file.txt
        WriterNumbersToFile writerNumbersToFile = new WriterNumbersToFile("C:\\taskone\\","C:\\taskone\\file.txt");
       //write numbers to file
        writerNumbersToFile.writeNumbersToFile(writerNumbersToFile.createNRandomNumbers(20));

        ReaderNumbersFromFile readerNumbersFromFile = new ReaderNumbersFromFile("C:\\taskone\\file.txt");
        //read from file
        readerNumbersFromFile.readFromFileAndWriteToList();
        //sort numbers
        integers = Sorter.sortAscending(readerNumbersFromFile.getIntegersFromFileList());
        //write to file
        writerNumbersToFile.writeNumbersToFile(integers);
    }
}

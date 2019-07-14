package by.mironenka.taskthree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {

    private Scanner scanner;
    private List<String> stringFromFileList;

    public FileController() {
        this.stringFromFileList = new ArrayList<String>();
    }

    public List<String> readFromFile(String fileName) throws FileNotFoundException {

        scanner = new Scanner(new File(fileName));
        while(scanner.hasNextLine()) {

            stringFromFileList.add(scanner.nextLine());

        }

        return stringFromFileList;
    }

    public List<String> reverseSymbolsInLine(List<String> list) {

        for(int i = 0; i < list.size(); i++){

            String line = list.get(i);
            String reverse = "";
            for(int j = line.length() - 1; j >= 0; j--) {

                reverse = reverse + line.charAt(j);
            }
            list.set(i, reverse);
        }

        return list;
    }

    public void writeToFile(List<String> list, String fileName) throws IOException {

        FileWriter fileWriter = new FileWriter(new File(fileName));

        for(String line : list) {

            fileWriter.write(line + "" + System.getProperty("line.separator"));
        }
        fileWriter.close();
    }


}

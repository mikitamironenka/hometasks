package by.mironenka.tasktwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {

    private final String fileName;
    private Scanner scanner;
    private List<String> stringFromFileList;

    public FileController(String fileName) {
        this.fileName = fileName;
        this.stringFromFileList = new ArrayList<String>();
    }

    public List<String> readFromFile() throws FileNotFoundException {

        scanner = new Scanner(new File(fileName));
        while(scanner.hasNextLine()) {

            stringFromFileList.add(scanner.nextLine());

        }

        return stringFromFileList;
    }

    public List<String> replacePublicWithPrivate(List<String> list) {

        for(int i = 0; i < list.size(); i++){

            String newLine = list.get(i).replaceAll("public","private");
            list.set(i, newLine);
        }

        return list;
    }

    public void writeToFile(List<String> list) throws IOException {

        FileWriter fileWriter = new FileWriter(new File(fileName));

        for(String line : list) {

            fileWriter.write(line + "" + System.getProperty("line.separator"));
        }
        fileWriter.close();
    }



}

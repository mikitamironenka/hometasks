package by.mironenka.taskone.writernumberstofile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WriterNumbersToFile {

    private final File file;
    private FileWriter fileWriter;
    private List<Integer> randomNumberList = new ArrayList<Integer>();

    public WriterNumbersToFile(String directoryName, String fileName) {
        new File(directoryName).mkdir();
        this.file = new File(fileName);
    }

    public File getFile() {
        return file;
    }

    public List<Integer> createNRandomNumbers(int numberOfNumbers) {

        Random random = new Random();

        for(int i = 0; i < numberOfNumbers; i++) {

            int number = random.nextInt();
            randomNumberList.add(number);
        }

        return randomNumberList;
    }


    public void writeNumbersToFile(List<Integer> list) throws IOException {

        FileWriter fileWriter = new FileWriter(file);

        for(int i = 0; i < list.size() - 1; i++) {

            fileWriter.write(list.get(i) + "" + System.getProperty("line.separator"));
            System.out.println(list.get(i));
        }
        fileWriter.close();
    }



}


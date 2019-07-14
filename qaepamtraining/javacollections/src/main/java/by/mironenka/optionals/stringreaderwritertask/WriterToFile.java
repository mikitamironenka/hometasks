package by.mironenka.optionals.stringreaderwritertask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterToFile {

    private final File file;
    private FileWriter fileWriter;

    public WriterToFile(String fileName) {
        this.file = new File(fileName);
    }


    public void writeStringsToFileFromList(List<String> list) throws IOException {

        fileWriter = new FileWriter(file);

        for(int i = list.size()-1; i >= 0; i--) {

            try {
                fileWriter.write(list.get(i) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public File getFile() {
        return file;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

}

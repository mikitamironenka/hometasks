package by.mironenka.optionals.subdirectorytask;

// Создать список из элементов каталога и его подкаталогов.

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {

        String directoryName = GetterOfDirectoryName.getDirectoryName();

        File myDirectory = new File(directoryName);

        SubDirectoryListCreator subDirectoryListCreator = new SubDirectoryListCreator();

        List<File> list = subDirectoryListCreator.createDirectoriesList(myDirectory);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getPath());
        }
    }
}

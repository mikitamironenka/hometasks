package by.mironenka.optionals.subdirectorytask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubDirectoryListCreator {

    private final List<File> list;

    public SubDirectoryListCreator() {
        this.list = new ArrayList<File>();
    }

    public List<File> getList() {
        return list;
    }

    public List<File> createDirectoriesList(File file) throws IOException {

        File[] currentSeekingFolderContent = file.listFiles();

        for (int i = 0; i < currentSeekingFolderContent.length; i++) {
            if (currentSeekingFolderContent[i].isDirectory()) {
                list.add(currentSeekingFolderContent[i]);
                createDirectoriesList(currentSeekingFolderContent[i]);
            }
        }
        return list;
    }
}

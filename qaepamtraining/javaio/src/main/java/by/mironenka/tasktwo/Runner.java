package by.mironenka.tasktwo;
//Прочитать текст Java-программы и все слова public
//в объявлении атрибутов и методов класса заменить на слово private.

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        FileController fileController = new FileController("C:\\taskone\\TestClass.java");
        fileController.writeToFile(fileController.replacePublicWithPrivate(fileController.readFromFile()));
    }
}

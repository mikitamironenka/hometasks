package by.mironenka.taskthree;
//Прочитать текст Java-программы и записать в другой файл
// в обратном порядке символы каждой строки.

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        FileController fileController = new FileController();

        fileController.writeToFile(fileController.reverseSymbolsInLine(fileController.readFromFile("C:\\taskone\\TestClass.java")),
                "C:\\taskone\\result.java");
    }
}

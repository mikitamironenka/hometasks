package by.mironenka.maintask;

//В символьном файле находится информация об N числах с плавающей запятой. Прочитать информацию из файла.
//Проверить на корректность, то есть являются ли данные числами. Преобразовать к числовым значениям и
//вычислить сумму и среднее значение прочитанных чисел.
//Создать собственный класс исключения.
//Предусмотреть обработку исключений, возникающих при нехватке памяти, отсутствии самого файла по
//заданному адресу, отсутствии или некорректности требуемой записи в файле, недопустимом
//значении поля (выходящим за пределы максимально допустимых значений) и т. д.

import by.mironenka.maintask.readerfromfile.ReaderFromFile;
import org.apache.commons.lang.math.NumberUtils;

public class Runner {

    private static String fileName = System.getProperty("user.dir") + "\\javaexceptions\\src\\main\\java\\by\\mironenka\\maintask\\file.txt";
//    private static String fileName = "ggggg";
    public static void main(String[] args) {

        ReaderFromFile reader = new ReaderFromFile(fileName);

        reader.readFromFileAndWriteToList();
        for(String line : reader.getListWithStringsFromFile()) {
            System.out.println(line);
        }

        NumbersManipulator numbersManipulator = new NumbersManipulator(reader.getListWithStringsFromFile());

        if(numbersManipulator.areDataNumbers()) {

                numbersManipulator.addDataToDoubleList();

        }

        System.out.println("Avarage value is " + numbersManipulator.calculateAverage());
        System.out.println("Summ is " + numbersManipulator.calculateSummOfNumbers());

    }
}

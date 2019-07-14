package by.mironenka.optionals.subdirectorytask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetterOfDirectoryName {

    public static String getDirectoryName() {

        String name;

        System.out.println("Enter directory name , please ");

        Scanner sc1 = new Scanner(System.in);
            name = sc1.next();

        return name;
    }
}

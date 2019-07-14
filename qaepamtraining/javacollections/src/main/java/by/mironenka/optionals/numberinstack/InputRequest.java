package by.mironenka.optionals.numberinstack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputRequest {

    public static int getNumberFromUser() {

        int number = 0;
        System.out.println("Введите число ");
        Scanner sc1 = new Scanner(System.in);
        try {
            number = sc1.nextInt();

        } catch (InputMismatchException e)
        {
            System.out.print("Вы ввели не число." );
        }

        return number;
    }
}

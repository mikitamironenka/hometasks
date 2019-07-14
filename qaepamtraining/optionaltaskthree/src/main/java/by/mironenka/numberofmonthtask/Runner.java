package by.mironenka.numberofmonthtask;

import java.time.Month;
import java.util.Scanner;

//Задание.
//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number from 1 to 12");

        String userAnswer = scanner.next();

        printMonthName(userAnswer);

    }

    public static void printMonthName(String string) {

        int number = Integer.parseInt(string);

        if(number < 1 || number > 12) {
            try {
                throw new UserAnswerException("Check your answer. Enter the number from 1 to 12");
            } catch (UserAnswerException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Month.of(number).name());
    }
}

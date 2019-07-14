package by.mironenka.taskone;

import java.util.Scanner;

//1.     Приветствовать любого пользователя при вводе его имени через командную строку.

public class Runner {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName);

    }
}

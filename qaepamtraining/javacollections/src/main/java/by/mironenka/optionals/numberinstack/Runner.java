package by.mironenka.optionals.numberinstack;

public class Runner {

    public static void main(String[] args) {

        int number = InputRequest.getNumberFromUser();
        ReverseNumberClass reverseNumberClass = new ReverseNumberClass(number);
        reverseNumberClass.reverseNumber();

    }
}

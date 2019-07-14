package by.mironenka.maintask.customexceptions;

public class IncorrectFileNameException extends Exception{

    public IncorrectFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}


package exception;

class MyException extends Exception {}

public class Source {
    public static void method() throws MyException {
        throw new MyException();
    }
}

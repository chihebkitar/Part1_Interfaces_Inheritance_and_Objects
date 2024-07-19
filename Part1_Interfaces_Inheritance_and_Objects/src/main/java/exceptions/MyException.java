package exceptions;

public class MyException extends Exception{

    public MyException() {
        this("the msg of my exception");
    }
    public MyException(String message) {
        super(message);
    }


}

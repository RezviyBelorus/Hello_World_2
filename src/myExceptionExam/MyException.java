package myExceptionExam;

/**
 * Created by alexfomin on 26.04.17.
 */
public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "myExceptionExam[" + detail + "]";
    }
}

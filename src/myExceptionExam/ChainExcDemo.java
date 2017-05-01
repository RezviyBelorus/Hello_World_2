package myExceptionExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class ChainExcDemo {
    static void demoProc() {
        NullPointerException e = new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено: " + e);
            System.out.println("Исходная причина: " + e.getCause());
        }
    }
}

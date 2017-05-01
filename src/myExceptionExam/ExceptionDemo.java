package myExceptionExam;

/**
 * Created by alexfomin on 26.04.17.
 */
public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Вызван compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
       try {
           compute(1);
           compute(20);
       } catch (MyException e) {
           System.out.println("Перехвачено " + e);
       }
    }
}

package myExceptionExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class MultyCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int vals[] = {1, 2, 3};

        try {
            int result = a/b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Обрабатывается исключение: " + e);
        }
        System.out.println("после мультиобработчика");

        if(a < b || a >= 0) {
            System.out.println("operator if");
        }
    }
}

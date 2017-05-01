package tryCatch;

/**
 * Created by alexfomin on 26.04.17.
 */
public class TryCatchStarter {
    public static void main(String[] args) {
        int d , a;
        try {
            d = 0;
            a = 42 /d;
            System.out.println("Will not display");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
        System.out.println("After block catch");
    }
}

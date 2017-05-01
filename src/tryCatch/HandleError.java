package tryCatch;

import java.util.Random;

/**
 * Created by alexfomin on 26.04.17.
 */
public class HandleError extends Throwable{
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random r = new Random();

        for (int i = 0; i < 1000; i++) {


            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero");
                System.out.println(e.toString());
                a = 0;
            }
            System.out.println("a = " + a);
        }
    }
}

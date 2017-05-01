package tryCatch;

/**
 * Created by alexfomin on 26.04.17.
 */
public class InnerTry {
    public static void main(String[] args) {
        int x = 2;
        int[] y = new int[1];
        try {
            y[0] = 55;
            try {
                y[3] = 45;
            } finally {
                System.out.println("Ошибка выхода за пределы массива не обработана во вложенном блоке try");
            }
        }  catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива" + e);
        }
    }
}

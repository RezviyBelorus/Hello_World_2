package tryCatch;

/**
 * Created by alexfomin on 26.04.17.
 */
public class ThrowDemo {
    static void demoProc () {
        try {
            throw new NullPointerException("demo demo");
        } catch (NullPointerException e) {
            System.out.println("Перехвачено внутри demoproc.");
            System.out.println(e.getMessage());
            throw e; // повторно передать исключение
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
            System.out.println("Message " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println("the end");
    }
}

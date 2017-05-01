package abstractClass;

/**
 * Created by alexfomin on 24.04.17.
 */
public class AbstractClassStarter {
    public static void main(String[] args) {
        A b = new B(1);
        b.callme();

        A a = new B(1);
    }
}

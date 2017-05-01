package abstractClass;

/**
 * Created by alexfomin on 24.04.17.
 */
public class B extends A {

    B(int x) {
        super(x);
        System.out.println("Contructor B");
    }

    {
        System.out.println("Static block B");
    }

    void callme() {
        System.out.println("Realised method in class B");
    }
}

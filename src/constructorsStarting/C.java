package constructorsStarting;

/**
 * Created by alexfomin on 24.04.17.
 */
public class C extends B {
    C() {
        System.out.println("Inside constructor C");
    }

    void  display() {
        System.out.println("Class C");
    }

    void  displayC() {
        System.out.println("Class C, displayC");
    }
}

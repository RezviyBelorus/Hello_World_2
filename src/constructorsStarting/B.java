package constructorsStarting;

/**
 * Created by alexfomin on 24.04.17.
 */
public class B extends A {
    B() {
        System.out.println("Inside constructor B");
    }

    void displayB() {
        System.out.println("Class B, displayB");
    }

    void display() {
        System.out.println("Class B");
    }

    void  displayC() {
        System.out.println("Class B, method's name displayC");
    }
}

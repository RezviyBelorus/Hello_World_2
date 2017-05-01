package abstractClass;

/**
 * Created by alexfomin on 24.04.17.
 */
public abstract class A {


    A(int x) {
        System.out.println("Constructor A");
    }

    {
        System.out.println("static block A");
    }
    int x;

    abstract void callme();

    void callmetoo(){
        System.out.println("Realised method");
    }
}

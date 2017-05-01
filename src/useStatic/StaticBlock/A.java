package useStatic.StaticBlock;

/**
 * Created by alexfomin on 30.04.17.
 */
public class A {
    {
        System.out.println("static A");
    }

    public A() {
        System.out.println("Constructor A");
    }
}

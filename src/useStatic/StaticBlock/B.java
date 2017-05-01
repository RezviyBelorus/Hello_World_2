package useStatic.StaticBlock;

/**
 * Created by alexfomin on 30.04.17.
 */
public class B extends A {
    {
        System.out.println("static B");
    }

    public B() {
        System.out.println("Constructor B");
    }
}

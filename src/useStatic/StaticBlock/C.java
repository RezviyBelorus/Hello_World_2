package useStatic.StaticBlock;

/**
 * Created by alexfomin on 30.04.17.
 */
public class C extends B{


    public C() {
        System.out.println("Constructor C");
    }
    {
        System.out.println("static C");
    }
}

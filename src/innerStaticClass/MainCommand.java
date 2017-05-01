package innerStaticClass;

/**
 * Created by alexfomin on 22.04.17.
 */
public class MainCommand {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args i = " + args[i]);
        }
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        innerStaticClass.test();
    }
}

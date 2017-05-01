package useStatic;

/**
 * Created by alexfomin on 22.04.17.
 */
public class StaticVar {
    static int a = 3;
    static int b;
    private final static int CANT_CHANGE = 10;
    final int array[] = {1, 2, 3};

    StaticVar(){
        int x = 0;
        array[0]= 10;
        System.out.println("constructor X = " + x);
        System.out.println("array after constructor [0] = " + array[0]);
    }
    static void meth(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("a in static block = " + a);
        System.out.println("b in static block = " + b);
        a = 4;
        b = 1;
    }
}

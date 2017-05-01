/**
 * Created by alexfomin on 05.05.16.
 */
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        short a;
        int aa = 65537;

        System.out.println("\nПреобразование int в byte.");
        b = (byte) i;
        System.out.println("i и b " + i + " " + b);

        System.out.println("\nПреобразование double в int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);

        System.out.println("\nПреобразование double в byte.");
        b = (byte) d;
        System.out.println("d и b " + d + " " + b);

        a = (short) aa; //65537-(32767*2+2)

        //65537 - eto a; (32767*2+2) - количество символов в типе short
        System.out.println("\n.Convert int to short = " +a);

        int ZZ = 2000000000;
        ZZ = ZZ*2;
        System.out.println(ZZ);

        byte bb = 50;
        bb = (byte) (bb*2);
        System.out.println(bb);

    }
}

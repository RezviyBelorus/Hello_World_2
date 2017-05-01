package recursion;

/**
 * Created by alexfomin on 21.04.17.
 */
public class Factorial {
    int result;
    int fact(int n) {
        System.out.println("n = " + n);
        if (n==1) {
            return 1;
        };

        result = fact(n-1)*n;
        return result;
    }
}

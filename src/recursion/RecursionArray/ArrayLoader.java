package recursion.RecursionArray;

/**
 * Created by alexfomin on 21.04.17.
 */
public class ArrayLoader {
    public static void main(String[] args) {
        RecursionArray ob = new RecursionArray(10);

        int i;

        for (i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}

package recursion.RecursionArray;

/**
 * Created by alexfomin on 21.04.17.
 */
public class RecursionArray {
    int values[];
    RecursionArray(int i){
        values = new int[i];
    }

    void printArray(int i){
        System.out.println("i = " + i);
        if(i==0) {
            return;
        } else {
            printArray(i-1);
        }
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}




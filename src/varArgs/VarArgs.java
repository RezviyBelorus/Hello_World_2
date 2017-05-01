package varArgs;

/**
 * Created by alexfomin on 23.04.17.
 */
public class VarArgs {
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for(int x: v) {
            System.out.print(x + " ");
        }
            System.out.println();
    }
}

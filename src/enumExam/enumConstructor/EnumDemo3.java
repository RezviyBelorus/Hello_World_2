package enumExam.enumConstructor;

/**
 * Created by alexfomin on 01.05.17.
 */
public class EnumDemo3 {
    public static void main(String[] args) {
//        Apple ap;

        System.out.println("Winesap стоит " +
                Apple.Winesap.getPrice() + " центов.\n");

        System.out.println("Все цены яблок:");
        for (Apple a: Apple.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
        }
    }
}

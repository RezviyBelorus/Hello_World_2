package innerStaticClass;

/**
 * Created by alexfomin on 22.04.17.
 */
public class InnerStaticClass {
    int x = 100;
    String name = new String();
    static int y = 50;
    void test() {
        Inserted inserted = new Inserted();
        inserted.display();
    }

    static class Inserted {
        void display() {
            InnerStaticClass innerStaticClass = new InnerStaticClass();
            System.out.println("non-static x = " + innerStaticClass.x);
            System.out.println("y = " + y);
        }
    }
}

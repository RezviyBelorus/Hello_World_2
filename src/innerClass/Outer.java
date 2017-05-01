package innerClass;

/**
 * Created by alexfomin on 22.04.17.
 */
public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
        System.out.println("x = " + inner.x);
    }

    //это внутренний класс
    class Inner {
        int x = 100;
        void display() {
            System.out.println("вывод: outer_x " + outer_x);
        }
    }
}

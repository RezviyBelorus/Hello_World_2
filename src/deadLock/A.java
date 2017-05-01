package deadLock;

/**
 * Created by alexfomin on 30.04.17.
 */
public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в A.foo");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " пытается вызвать B.last");
        b.last();
    }

    synchronized void last() {
        System.out.println("Внутри A.last");
    }
}

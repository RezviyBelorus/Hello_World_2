package deadLock;

/**
 * Created by alexfomin on 30.04.17.
 */
public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в B.bar");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " пытается вызвать A.last");
        a.last();
    }

    synchronized void last() {
        System.out.println("внутри A.last");
    }
}

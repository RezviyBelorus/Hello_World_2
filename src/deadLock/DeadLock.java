package deadLock;

/**
 * Created by alexfomin on 30.04.17.
 */
public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        a.foo(b);
        System.out.println("назад в главный поток");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("назад в другой поток");
    }

    public static void main(String[] args) {

        new DeadLock();
    }
}

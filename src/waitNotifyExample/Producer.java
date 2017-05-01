package waitNotifyExample;

/**
 * Created by alexfomin on 29.04.17.
 */
public class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            q.put(i++);
        }
    }
}

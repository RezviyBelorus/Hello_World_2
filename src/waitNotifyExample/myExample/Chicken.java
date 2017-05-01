package waitNotifyExample.myExample;

/**
 * Created by alexfomin on 29.04.17.
 */
public class Chicken implements Runnable {
    Question q;

    public Chicken(Question q) {
        this.q = q;
        new Thread(this, "Chicken").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            q.chicken();
        }
    }
}

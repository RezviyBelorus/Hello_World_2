package waitNotifyExample.myExample;

/**
 * Created by alexfomin on 29.04.17.
 */
public class Egg implements Runnable{
    Question q;

    public Egg(Question q) {
        this.q = q;
        new Thread(this, "Egg").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            q.egg();
        }
    }
}

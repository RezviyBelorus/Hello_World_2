package synchronizedExam;

/**
 * Created by alexfomin on 28.04.17.
 */
public class Caller implements Runnable{

    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s, String threadName) {
        target = targ;
        msg = s;
        t = new Thread(this, threadName);
//        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (target) {
                target.call(msg);
                System.out.println(t.getName());
            }
        }
    }
}

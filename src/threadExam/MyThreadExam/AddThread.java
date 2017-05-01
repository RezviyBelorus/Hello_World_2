package threadExam.MyThreadExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class AddThread implements Runnable {

    Thread t;

    public AddThread() {
        t = new Thread(this,"Additional thread");
        System.out.println("Дочерний поток запущен");
        t.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Smth was wrong");
        }
        System.out.println("Additional threadExam finished");
    }
}

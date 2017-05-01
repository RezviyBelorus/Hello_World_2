package threadExam.MyThreadExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class ThreadStarter {
    public static void main(String[] args) {
        try {
            new AddThread().t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Запускаю поток");


        try {
            for (int i = 55; i < 60; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main threadExam finished");
    }
}

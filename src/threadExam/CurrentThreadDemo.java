package threadExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток: " + t);

        // change name of thread
        t.setName("Мой threadExam");
        System.out.println("После изменения имени: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        String threadName = t.getName();
        System.out.println("Name: " + threadName);
    }
}

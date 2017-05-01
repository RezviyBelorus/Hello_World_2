package threadExam.ThreadExtendsThread;

/**
 * Created by alexfomin on 27.04.17.
 */
public class ExtendThread {
    public static void main(String[] args) {

       Thread t = new NewThread();
       t.start();
        try {
            t.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());


        try {
            for (int i = 55; i > 50; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}

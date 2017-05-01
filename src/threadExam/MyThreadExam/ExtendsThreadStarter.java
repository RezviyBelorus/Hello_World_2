package threadExam.MyThreadExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class ExtendsThreadStarter {
    public static void main(String[] args) {
        try {
            new ExtendThreadAdd().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        for (int i = 55; i < 60; i++) {
            System.out.println(i);
        }
        System.out.println("Main thread finished");
        System.out.println("getname(): " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().toString());
    }
}

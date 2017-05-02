package mThreadSuspendResume;

/**
 * Created by alexfomin on 01.05.17.
 */
public class NewThread implements Runnable {
    private String name; // имя потока
    private Thread t;
    private boolean suspendFlag;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        suspendFlag = false;
        t.start(); // запустить поток
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }

     synchronized void mySuspend() {
        suspendFlag = true;
    }

     synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}

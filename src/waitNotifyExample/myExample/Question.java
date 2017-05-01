package waitNotifyExample.myExample;

/**
 * Created by alexfomin on 29.04.17.
 */
public class Question {
    boolean who = false;

    synchronized void egg() {
        while(!who) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("egg");
        who = false;
        notify();
    }

    synchronized void chicken() {
        while(who) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("chicken");
        who = true;
        notify();
    }
}

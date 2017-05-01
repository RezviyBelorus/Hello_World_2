package waitNotifyExample;

/**
 * Created by alexfomin on 29.04.17.
 */
public class PCFixed {
    public static void main(String[] args) {
        Q q= new Q();
        new Producer(q);
        new Consumer(q);
    }
}

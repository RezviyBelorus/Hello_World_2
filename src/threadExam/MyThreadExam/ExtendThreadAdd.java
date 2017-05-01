package threadExam.MyThreadExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class ExtendThreadAdd extends Thread {
    public ExtendThreadAdd() {
//        super("Additional threadExam");
        System.out.println("Add threadExam Started");
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

package synchronizedExam;

/**
 * Created by alexfomin on 28.04.17.
 */
public class Sync {
    public static void main(String[] args) {
        Callme target = new Callme();

        while (true) {
            Caller ob1 = new Caller(target, "Добро пожаловать", "threadExam 1");
            ob1.t.setPriority(10);
            Caller ob2 = new Caller(target, "в синхронизированный", "threadExam 2");
            ob2.t.setPriority(8);
            Caller ob3 = new Caller(target, "мир", "threadExam 3");
            ob3.t.setPriority(1);


            ob1.t.start();

            ob2.t.start();

            ob3.t.start();
        }
    }
}

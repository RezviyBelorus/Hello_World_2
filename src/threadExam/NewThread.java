package threadExam;

/**
 * Created by alexfomin on 27.04.17.
 */
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Создать новый, второй поток
        t = new Thread(this,"Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + t);

        t.start(); // запустить поток
    }

    // Точка входа второго потока
    @Override
    public void run() {
        try {
            for (int i = 55; i > 50; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}

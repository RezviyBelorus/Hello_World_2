package mThreadSuspendResume;

/**
 * Created by alexfomin on 01.05.17.
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");


//        try {
//            threadExam.sleep(1000);
//            ob1.mySuspend();
//            System.out.println("Приостановка потока Один");
//            threadExam.sleep(1000);
//            ob1.myResume();
//            System.out.println("Возобновление потока Один");
//            ob2.mySuspend();
//            System.out.println("Приостановка потока Два");
//            threadExam.sleep(1000);
//            ob2.myResume();
//            System.out.println("Возобновление потока Два");
//        } catch (InterruptedException e) {
//            System.out.println("Главный поток прерван");
//        }

        ob1.mySuspend();
        System.out.println("Приостановка потока Один");
        ob1.myResume();

        System.out.println("Возобновление потока Один");

        ob2.mySuspend();
        System.out.println("Приостановка потока Два");
        ob2.myResume();
        System.out.println("Возобновление потока Два");

        System.out.println("Главный поток завершен");
    }
}

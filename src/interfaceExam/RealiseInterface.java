package interfaceExam;

/**
 * Created by alexfomin on 26.04.17.
 */
public class RealiseInterface implements Display {
    @Override
    public void showMe() {
        System.out.println("Realised method");
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        Display display = new RealiseInterface();
        display.showMe();

        Display displayOneTwo = new DisplayOne();

        int x = 0;
        int y = 42/x;
    }
}

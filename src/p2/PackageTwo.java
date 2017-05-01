package p2;


import p1.PackageOne; // если в наследовании указан класс с именем пакета, то импорт необязателен

/**
 * Created by alexfomin on 25.04.17.
 */
public class PackageTwo {

    static p1.PackageOne p1 = new PackageOne();

    public static void main(String[] args) {
        String stroka = "test";

        p1.PackageOne p11 = new PackageOne();
        int w = p11.y;
        int ww = p1.y;
        p11.displayPub();

        p2.PackageTwo p2 = new PackageTwo();


    }
    void newDisplay() {

    }
}

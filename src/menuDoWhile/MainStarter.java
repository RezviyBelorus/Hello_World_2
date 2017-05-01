package menuDoWhile;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by alexfomin on 17.04.17.
 */
public class MainStarter {
    public static void main(String[] args) throws IOException {
        Scanner point = new Scanner(System.in);
        byte pointOfMenu;
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMenu();
        System.out.println("Choose menu item: ");
        pointOfMenu = point.nextByte();
        System.out.println("Вы выбрали: " + pointOfMenu);
        if (pointOfMenu > mainMenu.getMenu().length) {
            System.out.println("Invalid menu item");
            mainMenu.showMenu();
        } else {
            mainMenu.showInfo(pointOfMenu);
        }
        mainMenu.setX(0);
        System.out.println("x = " + mainMenu.getX());
    }
}

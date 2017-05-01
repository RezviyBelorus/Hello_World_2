package menuDoWhile;

/**
 * Created by alexfomin on 17.04.17.
 */
public class MainMenu {
    private int x;
    String[] menu = {"0. Crocodile", "1. Elephant", "2. Pig" };
    String[] info = {"Crocodile is green", "Elephant is gray", "Pig is pink"};

    protected void showMenu(){
        for (int i = 0; i <menu.length ; i++) {
            System.out.println(menu[i]);
        }
    }

    protected void showInfo(byte pointOfMenu){
        System.out.println(info[pointOfMenu]);
    }

    public String[] getMenu() {
        return menu;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

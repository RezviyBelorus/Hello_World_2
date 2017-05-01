package p1;

/**
 * Created by alexfomin on 25.04.17.
 */
public class PackageOne {
    int x;
    public int y;
    private int z;

    void display() {
        System.out.println("default protection");
    }

    protected void displayPro(){
        System.out.println("protected");
    }

    private void displayPri() {
        System.out.println("private");
    }

    public void displayPub() {
        System.out.println("public");
    }
}

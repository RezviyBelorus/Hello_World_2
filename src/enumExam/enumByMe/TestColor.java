package enumExam.enumByMe;

/**
 * Created by alexfomin on 01.05.17.
 */
public class TestColor {
    public static void main(String[] args) {
        Color color = Color.Green;
        System.out.println("color: " + color);

        color = Color.Red;

        switch (color) {
            case Red:
                System.out.println("red");
                break;
            case Green:
                System.out.println("green");
                break;
            case Yellow:
                System.out.println("yellow");
                break;
        }
    }
}

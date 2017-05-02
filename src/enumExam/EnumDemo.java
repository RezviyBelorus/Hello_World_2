package enumExam;

/**
 * Created by alexfomin on 01.05.17.
 */
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        Apple allapples[] = Apple.values();

        ap = Apple.RedDel;

        for (int i = 0; i < allapples.length; i++) {
            System.out.println("i: " + allapples[i]);
        }

        System.out.println("value of: " + Apple.valueOf("RedDel"));

        String typeOfApple = Apple.valueOf("RedDel").toString();

        System.out.println("typeOfApple: " + typeOfApple);


        ap = Apple.GoldenDel;

        if(ap == Apple.GoldenDel) {
            System.out.println("ap содержит GoldenDel");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan red");
                break;

            case GoldenDel:
                System.out.println("GoldenDel yellow");
                break;
            case RedDel:
                System.out.println("RedDel red");
                break;
            case Winesap:
                System.out.println("Winesap red");
                break;
            case Cortland:
                System.out.println("Cortland red");
                break;
        }
    }
}

package enumExam;

/**
 * Created by alexfomin on 02.05.17.
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        Integer i = new Integer("100");
        Integer k = 100;
        int y = k;
        System.out.println("i.intValue() = " + i.intValue());

        if(i == k) {
            System.out.println("i = k");
        } else {
            System.out.println("i != k");
        }

        System.out.println("Вот все константы " +
                " и их порядковые значения: ");

        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " идет перед " + ap2);
        }

        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " идет перед " + ap);
        }

        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " эквивалентно " + ap3);
        }

        if (ap.equals(ap2)) {
            System.out.println("Error!");
        }

        if (ap.equals(ap3)) {
            System.out.println(ap + " equals " + ap3);
        }

        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}

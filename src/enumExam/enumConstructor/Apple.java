package enumExam.enumConstructor;

/**
 * Created by alexfomin on 01.05.17.
 */
public enum Apple {
    Jonathan(10, 1), GoldenDel(9, 2), RedDel(22, 3), Winesap(15, 4), Cortland(8, 5),
    Pineapple(1);

    private int price;
    private int value;

    Apple(int p, int value) {
        price = p;
        this.value = value;
    }

    Apple(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

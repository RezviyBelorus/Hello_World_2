package waitNotifyExample.myExample;

/**
 * Created by alexfomin on 29.04.17.
 */
public class QusetionStarter {
    public static void main(String[] args) {
        Question q = new Question();
        Egg egg = new Egg(q);
        Chicken chicken = new Chicken(q);
    }
}

package overLoadDemo;

/**
 * Created by alexfomin on 21.04.17.
 */
public class Loader {
    public static void main(String[] args) {
        int a = 10, b = 80;

        OverLoadDemo overLoadDemo = new OverLoadDemo(1,8);
        OverLoadDemo overLoadDemo2 = new OverLoadDemo();
        OverLoadDemo overLoadDemo3;

        System.out.println(overLoadDemo2.param1 + " " + overLoadDemo2.param2);
        overLoadDemo3 = overLoadDemo.incByTen();
//        overLoadDemo.test(5);
        System.out.println("Params before: " + overLoadDemo.param1 + "; " + overLoadDemo.param2);
        overLoadDemo.math(overLoadDemo);
        System.out.println("Params after");
        System.out.println("param1: " + overLoadDemo.param1);
        System.out.println("param2: " + overLoadDemo.param2);


        System.out.println("test after: " + overLoadDemo3.param1 + " " + overLoadDemo3.param2);
        overLoadDemo3 = overLoadDemo3.incByTen();
        System.out.println("test after_2: " + overLoadDemo3.param1 + " " + overLoadDemo3.param2);

        System.out.println("overLoadDemo.param1 = " + overLoadDemo.param1 + " overLoadDemo.param2 = " + overLoadDemo.param2);
    }
}

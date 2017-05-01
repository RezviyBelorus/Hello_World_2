package overLoadDemo;

/**
 * Created by alexfomin on 21.04.17.
 */
public class OverLoadDemo {

    int param1, param2;

    OverLoadDemo(int param11, int param22){
        param1 = param11;
        param2 = param22;
    }

    OverLoadDemo(){
        param1 = 1;
        param2 = 2;
    }

    void test(int x) {
        System.out.println(x);
    }
    void math(OverLoadDemo x){
        param1 *= 2;
        param2 /= 2;
    };
    void math(int a, int b){
        a *= 2;
        b /= 2;
    }

    OverLoadDemo incByTen(){
        OverLoadDemo test = new OverLoadDemo(param1+10, param2-10);
        return test;
    }
}

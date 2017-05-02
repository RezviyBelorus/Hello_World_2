package annotation.myAnnotation;

import java.lang.reflect.Method;

/**
 * Created by alexfomin on 02.05.17.
 */
public class ReflectionTest {
    @MyAnno(name = "findAnno", value = 100)
     public static void findAnno() {
        ReflectionTest reflectionTest = new ReflectionTest();

        try {
            Class<?> reflection = reflectionTest.getClass();
            for(Method method: reflection.getDeclaredMethods()) {
                System.out.println("method: " + method);
            }
            Method method = reflection.getMethod("findAnno");
            MyAnno anno = method.getAnnotation(MyAnno.class);
            System.out.println(anno.name() + " " + anno.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        findAnno();
    }
}

/*
Демострация использования значений типа boolean.
 */
public class BooleanTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равна " + b);

        b = true;
        System.out.println("b равна " + b);

        // значение типа boolean может управлять оператором if

        if (b) System.out.println("Это выполняется.");

        b = false;

        if (b) System.out.println("Это не выполняется.");

        // результат сравнения - значение типа boolean

        System.out.println("10 > 9 равно " + (10 > 9));
    }
}

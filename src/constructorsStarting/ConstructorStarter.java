package constructorsStarting;

/**
 * Created by alexfomin on 24.04.17.
 */
public class ConstructorStarter {
    public static void main(String[] args) {
        B c = new C();
//        c.display();  - Ошибка! переменная "с" не имеет доступа с методам класса "С"
        c.displayA(); // такой вариант возможен. Переменная "С" имеет доступ к методам класса "А"
        c.displayB(); // такой вариант возможен. Переменная "С" имеет доступ к методам класса "B"

        c.display();
        c.displayC();

    }
}

/*
Целевая часть цикла может быть пустой.
 */
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // вычисление среднего значения i и j
        while (++i < --j); // в этом цикле тело цикла отсутствует

        System.out.println("Среднее значение равно " +i);
    }
}

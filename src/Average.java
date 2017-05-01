/*
Вычисление среднего значения массива значений.
 */
public class Average {
    double sex; // для того чтобы переменную можно было юзать в других классах

    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        int a;

        for (i = 0; i < 5 ; i++)
            result = result + nums[i];
a = (int) result/5;
        System.out.println("Среднее значение равно " + result / 5);
        System.out.println("Целочисленная часть от среднего значения массива = " +a);
    }
}

/*
Вычисление расстояния, проходимого светом,
с применением переменных типа long
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света в милях за секунду

        lightspeed = 186000;

        days = 1000; // указание количества дней

        seconds = days*24*60*60; // преобразование в секунды

        distance = lightspeed * seconds; // вычисление расстояния

        System.out.print("За " +days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance+ " миль.");
    }
}

/*
Использование оператора break в цикле for в стиле for-each.
 */
public class ForEach2 {
    public static void main(String[] args) {

        int sum = 0;
        int nums[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };

        //использование цикла for для отображения и суммирования значений
        for (int x: nums
             ) {
            System.out.println("Значение х = " +x);
            sum += x;
            if (x==5) break; //прекращение цикла после получения 5 значений
        }

        System.out.println("Sum 1st five = " +sum);
    }
}

/*
Использование цикла for в стиле for-each применительно к двухмерному массиву.
 */
public class ForEach3 {
    public static void main(String[] args) {

        int sum = 0;
        int nums[][] = new int [3][5];

        // присвоение значений элементам массива nums

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        //использование цикла for в стиле for-each для отображения и суммирования значений

        for(int x[] : nums) {
            for(int у : x) {
                System.out.println("Значение равно: " + у);
                sum += у;
            }
        }

        System.out.println("Sum = " +sum);
    }
}

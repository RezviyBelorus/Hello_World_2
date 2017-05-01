/*
Поиск в массиве с применением цикла for в стиле for-each.
 */
public class Search {
    public static void main(String[] args) {

        int nums[] = { 6, 8, 3, 7 , 5, 6, 1, 4 };
        int val = 1;
        boolean found = false;
        int num = 0;

        //использование цикла for в стиле for-each для поиска в nums значения val

        for (int x: nums) {
            if(x==val) {
                found = true;
                num = x;
                break;
            }

        }
        if(found)
            System.out.println("Значение найдено! И оно равно " +num);
        else
            System.out.println("Такого значения в массиве нету");
    }
}

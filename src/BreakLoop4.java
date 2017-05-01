/*
Использование оператора break для выхода из вложенных циклов.
 */
public class BreakLoop4 {
    public static void main(String[] args) {

        outer:
        {
            for (int i = 0; i < 3; i++) {
                System.out.println("Проход " +i+ ": ");
                for (int j = 0; j < 100; j++) {
                    if(j==10) break outer; //exit from both cycles
                    System.out.print(j+ " ");
                }
                System.out.println("This string will not print");
            }
        }
        System.out.println("\nCycles completed");
    }
}
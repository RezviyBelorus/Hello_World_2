///**
// * Created by alexfomin on 07.04.17.
// */
public class ComeBackButterfly  {
    public static void main(String[] args) throws java.io.IOException {
        int weight = 4;
        int reverse = weight - 1;
        int matrica[][] = new int[weight][weight];

        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < weight; j++) {
                if (i == j) {
                    matrica[i][j] = 1;
                    matrica[i][reverse] = 1;
                    reverse--;
                }
            }
        }
        for (int i = 0; i < weight; i++) {
            for (int j = 0; j < weight; j++) {
                System.out.print(matrica[i][j]);
            }
            System.out.println();
        }


            byte choice;

            do {
                System.out.println("Справка по:");
                System.out.println("     1. if");
                System.out.println("     2. switch");
                System.out.println("     3. while");
                System.out.println("     4. do-while");
                System.out.println("     5. for\n");
                System.out.println("Выберите интересующий пункт:");
                choice = (byte) System.in.read();
                System.out.println("Пункт меню:" + choice);
            } while (choice < '1' || choice > '5');

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if(условие) оператор;");
                    System.out.println("else оператор;");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println(" case константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("while:\n");
                    System.out.println("while(условие) оператор;");
                    break;
                case '4':
                    System.out.println("do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие);");
                    break;
                case '5':
                    System.out.println("for:\n");
                    System.out.print("for(инициализация; условие; повторение)");
                    System.out.println(" оператор;");
                    break;
            }
        }
    }


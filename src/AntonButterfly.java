/*
Нарисовать матрицу которая будет иметь диагональные единицы и работала для любой квадратной матрицы
10001
01010
00100
01010
10001
 */
public class AntonButterfly {
    public static void main(String[] args) {
        int Kvadrat[][] = new int [5][5];
        int k = Kvadrat.length - 1; // k = длина масива переведенная в индекс
        int i, j;

        for (i = 0; i <Kvadrat.length ; i++) {
            for (j = 0; j <Kvadrat.length ; j++) {

                if (i==j) Kvadrat[i][j] = 1;
                if (j==k) Kvadrat[i][j] = 1;

                }
            k = k-1;
            }


        for (i = 0; i <Kvadrat.length ; i++) {
            for (j = 0; j < Kvadrat.length ; j++) {
                System.out.print(Kvadrat[i][j] + " ");
            }
            System.out.println();

        }
    }
}

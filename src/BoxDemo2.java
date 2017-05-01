/*
Эта программа объявляет два объекта класса Box.
 */

public class BoxDemo2 {
    public static void main(String args[]) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        Average av1 = new Average();



// присваивание значений переменным экземпляра myboxl
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        av1.sex = 0;

/* присваивание других значений переменным
        экземпляра mybox2 's
         */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
// вычисление объема первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);
// вычисление объема второго параллелепипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);
    }
}
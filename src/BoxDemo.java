/*
Программа, использующая класс Box.
Назовите этот файл BoxDemo.java
 */
class Box {
    double width;
    double height;
    double depth;
}

// Etot klass ob'avlaet ob'ekt klassa Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;


        // присваивание значений переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // вычисление объема параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}

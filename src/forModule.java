/*
Демонстрирует использование блока кода.
Назовите этот файл "forModule.java"
 */
public class forModule {
    public static void main(String[] args) {
        int y;

        y=20;

        // целевой модуль этого цикла - блок

        for (int x=0; x<10; x++) {
            System.out.println("Значение x:" +x);
            System.out.println("Значение y:" +y);
            y = y-2;
        }
        
    }
}

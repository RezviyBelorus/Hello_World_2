/*
использование блока кода для оператора if
 */
public class ifModule {
    public static void main(String[] args) {
        int x, y;
        x=1;
        y=2;

        if(x<y) {// начало блока
            x = y;
            y = 0;
        }  // конец блока
        System.out.println(x);
        System.out.println(y);
    }
}

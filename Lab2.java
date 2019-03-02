/**
 #  C5=1    C=Bt
 #  C7=1    Byte
 #  C11=9   Знайти середнє значення елементів кожного стовпчика матриця
 */
public class Lab2 {
    public static void main(String[] args) {

        // cтворюємо матрицю
        byte[][] m = {{1, 3, 5},
                      {2, 4, 6},
                      {7, 8, 9}};


        // виводимо на екран початкову матрицю
        System.out.println("Початкова матриця");
        System.out.println("-------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2d", m[i][j]);
            }
            System.out.println();
        }

        
        //транспонумо мартицю
        for (int i = 0; i < m.length-1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                byte temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }


        // виводимо на укран транспоновану мартицю
        System.out.println();
        System.out.println("Транспонована матриця");
        System.out.println("-------");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%2d", m[i][j]);
            }
            System.out.println();
        }


        //знаходимо середнє значення елементів кожного стовпчика матриці
        for(int i = 0; i < m.length; i++){
            double S = 0;
            for(int j = 0; j < m.length; j++) {
                S += m[j][i];
            }
            S = S/m.length;
            System.out.println("Середнє значення елементів " + (i + 1) + " стовпчика:\n  " + S);
        }
    }
}
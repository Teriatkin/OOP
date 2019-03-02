/**
 * C2 = 1 O1 = "+"
 * C3 = 2 C = 0
 * C5 = 1 O2 = "/"
 * C7 = 4 тип індексів i та j = short
 */
public class Lab1 {
    public static void main(String[] args) {
        double S = 0;
        int a = 1, n = 2, b = 1, m = 2;
        int flag = 0;
        final int C = 0;
//        short i = (short)a;
//        short j = (short)b;
        if ((a > n)|(b > m)){
            System.out.println("Помилка в границях сумування");
            return;
        }else {
            for (short i = (short) a; i <= n; i++) {
                for (short j = (short) b; j <= m; j++) {
                    if((i == 0) | (j == 0)){
                        flag = 1;
                        break;
                    }else{
                        S = S + ((double) (i / j) / (i + C));
                    }

                }
            }
        }
        if(flag == 0){
            System.out.println(S);
        }else{
            System.out.println("Ділення на нуль!");
        }

    }
}
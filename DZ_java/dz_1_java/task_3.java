// Реализовать простой калькулятор

package DZ_java.dz_1_java;
import java.util.Scanner;

public class task_3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        System.out.print("Укажите действие: ");
        char op = in.next().charAt(0);
        System.out.print("Введите число m: ");
        int m = in.nextInt();
        in.close();

        // double n = 15;
        // double m = 3;
        // char op = '/';

        
        double result = sum(n, m, op);
        if (result == 0.0) {
            System.out.println("Некорректный ввод данных");
        }
        else{
            System.out.println("Ответ: " + sum(n, m, op));
        }

    }

    public static double sum(double n, double m, char op) {
        switch (op) {

            case'+':
            double result1 = n + m;
            return result1;
            // System.out.printf("Сумма %.1f и %.1f = %.1f", n, m, result1);
            // break;

            case'-':
            double result2 = n - m;
            return result2;
            // System.out.printf("Сумма %.1f и %.1f = %.1f", n, m, result2);
            // break;

            case'*':
            double result3 = n * m;
            return result3;

            case'/':
            double result4 = n / m;
            return result4;

            default:
            // System.out.println("Некорректный ввод данных");
            double result5 = 0;
            return result5;
        }
    }
}

// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package DZ_java.dz_1_java;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Введите число n: ");
        int num = in.nextInt();
        in.close();

        sum_method(num);
        System.out.print("\n");
        factorial_method(num);
}

public static void factorial_method(int number) {
    int i = 1;
    int factorial = 1;
    while (i <= number) {
        factorial = factorial * i;
            i++;
        }
    System.out.printf("Факториал числа %d = %d", number, factorial);
}


public static void sum_method(int number) {
    int i = 0;
    int sum = 0;
    while (i <= number) {
        sum = sum + i;
        i++;
    }
    System.out.printf("Сумма от 1 до %d = %d", number, sum);
}

}
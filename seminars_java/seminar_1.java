// Task_1
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров,
// а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?
// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
// Программа должна вывести одно натуральное число.
// Sample Input 1:
// 10
// 3
// 2
// Sample Output 1:
// 8


// package seminars_java;
// import java.util.Scanner;

// public class seminar_1 {
//     public static void main(String[] args) {

//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите высоту столба для улитки : ");
//         int hiegth = in.nextInt();
//         System.out.print("Введите расстояние, котрое улитка проходит вверх : ");
//         int up = in.nextInt();
//         System.out.print("Введите расстояние, котрое улитка проходит вниз : ");
//         int down = in.nextInt();
//         in.close();

//             int count = 0;
//             while (true) {
//                 count += 1;
//                 hiegth -= up;
//                 if (hiegth <= 0) {
//                     break;
//                 }
//                 hiegth += down;
//             }
//             System.out.println(count);
//     }
// }






// Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек,
// если разрешается сделать один разлом по прямой между дольками (то есть разломить шоколадку на два прямоугольника).
// Входные данные
// Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.
// Выходные данные
// Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.
// Sample Input 1:
// 3 2 4
// Sample Output 1:
// YES


// package seminars_java;
// import java.util.Scanner;

// public class seminar_1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите n долек шоколадки : ");
//         int n = in.nextInt();
//         System.out.print("Введите m долек шоколадки : ");
//         int m = in.nextInt();
//         System.out.print("Введите кол-во отломленных k долек шоколадки : ");
//         int k = in.nextInt();
//         in.close();
//         if (k < n * m & k % m == 0 || k % n == 0) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }





// Task_3
// В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал
// пробег на 10% от предыдущего значения. По данному числу y определите номер дня,
// на который пробег спортсмена составит не менее y километров.
// Входные данные
// Программа получает на вход действительные числа x и y
// Выходные данные
// Программа должна вывести одно натуральное число.
// Sample Input:
// 10
// 20
// Sample Output:
// 9


// package seminars_java;
// import java.util.Scanner;

// public class seminar_1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите кол-во км , которые спортсмен пробежал в первый день : ");
//         double first_day_km = in.nextDouble();
//         System.out.print("Введите сколько он пробежал в итоге : ");
//         double final_km = in.nextDouble();
//         in.close();
//         int day_number = 1;
//         while (final_km >= first_day_km) {
//             day_number += 1;
//             first_day_km *= 1.1;
//         }
//         System.out.println(day_number);
//     }
// }





// Task_4
// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
// n! = 1∙2∙3∙…∙ n.
// Sample Input:
// 5
// Sample Output:
// 120

// package seminars_java;
// import java.util.Scanner;

// public class seminar_1 {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Введите число n факториала : ");
//         int number = in.nextInt();
//         in.close();
//         int result = 1;
//         for (int i = 2; i <= number; i++) {
//             result *= i;
//         }
//         System.out.printf("Факториал числа %d = %d", number, result);
//     }
// }
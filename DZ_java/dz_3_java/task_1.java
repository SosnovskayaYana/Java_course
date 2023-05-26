// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение


package DZ_java.dz_3_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
// import java.util.Collections;


public class task_1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);

        System.out.println("Преобразованный список: " + sort(list));
        System.out.println("Min значение: " + minValue(list));
        System.out.println("Max значение: " + maxValue(list));
        System.out.println("Среднее арифметическое: " + averagValue(list));



        // Iterator<Integer> i = list.iterator();
        // while (i.hasNext()) {
        // Integer s = i.next();
        // if (s % 2 == 0) {
        // i.remove();
        // }
        // }
        // System.out.println("Преобразованный список: " + list);

        // int min = Collections.min(list);
        // System.out.printf("Min = %d,", min);
        // int max = Collections.max(list);
        // System.out.println("Max = " + max);

    }



    public static ArrayList<Integer> sort(ArrayList<Integer> list) {

        Iterator<Integer> i = list.iterator();

        while (i.hasNext()) {
            Integer s = i.next();
            if (s % 2 == 0) {
                i.remove();
            }
        }
        return list;
    }



    public static Integer minValue(List<Integer> list) {
        int min = list.get(0);

        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }



    public static Integer maxValue(List<Integer> list) {
        int max = list.get(0);

        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }



    public static double averagValue(List<Integer> list) {
        double sum = 0;

        for (int i : list) {
            sum = sum + i;
        }

        double average = (sum / list.size());
        // способ округления числа до одного символа после запятой:
        double scale = Math.pow(10, 1);
        double result = Math.ceil(average * scale) / scale;

        return result;
    }
}

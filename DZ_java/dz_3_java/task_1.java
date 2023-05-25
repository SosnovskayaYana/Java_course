// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение


package DZ_java.dz_3_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 10; i ++){
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);


        Iterator <Integer> i = list.iterator();
        while (i.hasNext()){
            Integer s = i.next();
            if (s % 2 == 0){
                i.remove();
            }
        }
        System.out.println(list);




        int min = Collections.min(list);
        System.out.printf("Min = %d,", min);

        int max = Collections.max(list);
        System.out.println("Max = " + max);
    }
}

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации вывести в консоль.

package DZ_java.dz_2_java;

import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        
        int[] array = new int[] {-1, 7, -10, 21, -74, 0, 12};

        int temp = 0;

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array.length-1; j++){

                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
            System.out.println(Arrays.toString(array));
        }

    }
}

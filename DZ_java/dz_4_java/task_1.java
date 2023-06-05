// Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения. 
// Добавить ко всем значениям символ "!".
// Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого. 
// Объеденить значания во втором множестве и первом если ключи совподают. 
// Вывести результат в консоль. Реализовать с использованием и без использования метода merge.


package DZ_java.dz_4_java;

import java.util.HashMap;



public class task_1 {
    public static void main(String[] args) {

        HashMap <String, String> week = new HashMap<>();

        week.put("one", "monday");
        week.put("two", "tuesday");
        week.put("three", "wednesday");
        week.put("four", "thursday");
        week.put("five", "friday");
        week.put("six", "saturday");

        week.forEach( (k, v) -> System.out.println(k + " " + v) );


        week.computeIfPresent("one", (k, v) -> v += "!");
        week.computeIfPresent("two", (k, v) -> v += "!");
        week.computeIfPresent("three", (k, v) -> v += "!");
        week.computeIfPresent("four", (k, v) -> v += "!");
        week.computeIfPresent("five", (k, v) -> v += "!");
        week.computeIfPresent("six", (k, v) -> v += "!");

        System.out.println(week);


        HashMap <String, String> week2 = new HashMap<>();

        week2.put("four", "thursday");
        week2.put("five", "friday");
        week2.put("six", "saturday");
        week2.put("seven", "sunday");
        week2.put("eight", "mondey");
        
        System.out.println(week2);
    }
}

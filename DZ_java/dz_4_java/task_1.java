// Создать множество, ключ и значение - строки. Добавить шесть элементов. Вывести в консоль значения. 
// Добавить ко всем значениям символ "!".
// Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого. 
// Объеденить значания во втором множестве и первом если ключи совподают. 
// Вывести результат в консоль. Реализовать с использованием и без использования метода merge.


package DZ_java.dz_4_java;

import java.util.HashMap;



public class task_1 {
    public static void main(String[] args) {

        HashMap <String, String> week1 = new HashMap<>();

        week1.put("one", "monday");
        week1.put("two", "tuesday");
        week1.put("three", "wednesday");
        week1.put("four", "thursday");
        week1.put("five", "friday");
        week1.put("six", "saturday");

        // week1.forEach( (k, v) -> System.out.println(k + " " + v) );


        week1.computeIfPresent("one", (k, v) -> v += "!");
        week1.computeIfPresent("two", (k, v) -> v += "!");
        week1.computeIfPresent("three", (k, v) -> v += "!");
        week1.computeIfPresent("four", (k, v) -> v += "!");
        week1.computeIfPresent("five", (k, v) -> v += "!");
        week1.computeIfPresent("six", (k, v) -> v += "!");

        System.out.println("Первое множество: ");
        week1.forEach( (k, v) -> System.out.println(k + " " + v) );
        System.out.print("\n");


        HashMap <String, String> week2 = new HashMap<>();

        week2.put("four", "thursday");
        week2.put("five", "friday");
        week2.put("six", "saturday");
        week2.put("seven", "sunday");
        week2.put("eight", "mondey");
        
        System.out.println("Второе множество: ");
        week2.forEach( (k, v) -> System.out.println(k + " " + v) );
        System.out.print("\n");


        HashMap <String, String> week = new HashMap<>(week1);
        week.putAll(week2);

        System.out.println("Объединенное множество: ");
        week.forEach( (k, v) -> System.out.println(k + " " + v) );
        System.out.print("\n");


    }
}


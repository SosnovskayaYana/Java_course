// 1.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. 
// Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 2.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. 
// Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 3.Отсортировать по возрасту используя дополнительный список индексов.
// 4.Отсортировать по полу используя дополнительный список индексов.
// 5.*Сортировка по полу и возрасту.


import java.util.ArrayList;
import java.util.Scanner;

public class seminar_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ФИО, возраст, пол или Q для выхода: ");
        ArrayList<String> fname = new ArrayList<>();
        ArrayList<String> sname = new ArrayList<>();
        ArrayList<String> lname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        while (true) {
            String in = input.nextLine();

            if (in.toLowerCase().equals("q"))
                break;

            String[] str = in.split(" ");
            id.add(age.size());
            fname.add(str[0]);
            sname.add(str[1]);
            lname.add(str[2]);
            age.add(Integer.valueOf(str[3]));
            gender.add(str[4].toLowerCase().contains("м"));

            // int a = Integer.parseInt(list.get(0).split(" ")[3])
        }
        input.close();

        for (int i = 0; i < fname.size() - 1; i++) {
            int max = age.get(id.get(i));
            int index = i;

            for (int j = i + 1; j < fname.size(); j++) {

                if (age.get(id.get(j)) < max) {
                    index = j;
                    max = age.get(id.get(j));
                }
            }

            if (index != i) {
                int tmp = id.get(i);
                id.set(i, id.get(index));  // метод set меняет местами элементы
                id.set(index, tmp);
            }
        }

        System.out.println(id);


// вывод списком:
        for (int i = 0; i < age.size(); i++) {

            System.out.println(fname.get(id.get(i)) + " " + sname.get(id.get(i)).toUpperCase().charAt(0) + "."
                    + lname.get(id.get(i)).toUpperCase().charAt(0) + ". " + age.get(id.get(i)));
        }

    }
}

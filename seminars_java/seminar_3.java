//Даны следующие строки, cравнить их с помощью == и метода
// equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});



import java.util.ArrayList;
// import java.util.Comparator;
import java.util.Random;
// import javax.swing.text.html.HTMLDocument.Iterator;



public class seminar_3 {
    public static void main(String[] args) {

        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = s1;
        // String s4 = "h" + "e" + "l" + "l" + "o";
        // String s5 = new String("hello");
        // String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        // if (s1.equals(s2))System.out.println("Элементы равны"); else
        // System.out.println("Элементы не равны");
        // if (s1 == s2 )System.out.println("Элементы равны"); else
        // System.out.println("Элементы не равны");

        // if (s3.equals(s4))System.out.println("Элементы равны"); else
        // System.out.println("Элементы не равны");
        // if (s3 == s4 )System.out.println("Элементы равны"); else
        // System.out.println("Элементы не равны");

        // if (s5.equals(s6))System.out.println("Элементы равны"); else
        // System.out.println("Элементы не равны");
        // if (s5 == s6 )System.out.println("Элементы равны"); else
        // System.out.println("Элементы не равны");






        // Заполнить список десятью случайными числами.
        // Отсортировать список методом sort() и вывести его на экран.


        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < 10; i++) {
        // list.add(new Random().nextInt(10));

        // }
        // System.out.println(list);

        // list.sort(Comparator.naturalOrder());
        // System.out.println(list);





        // Заполнить список названиями планет Солнечной системы в
        // произвольном порядке с повторениями.
        // Вывести название каждой планеты и количество его
        // повторений в списке.

        String[] planet = new String[] { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        // ArrayList<String> listPlan = new ArrayList<>();

        // for (int i = 0; i < 11; i++) {
        // listPlan.add(planet[new Random().nextInt(planet.length - 1)]);
        // }

        // System.out.println(listPlan);
        // ArrayList<String> list2 = new ArrayList<>();

        // while (listPlan.size() > 0) {
        // String tnp = listPlan.get(0);

        // listPlan.remove(0);
        // int cnt = 1;

        // java.util.Iterator<String> i = listPlan.iterator();
        // while (i.hasNext()) {
        // String s = i.next();
        // if (s.equals(tnp)) {
        // cnt++;
        // i.remove();
        // }
        // }

        // for (int i = 0; i < listPlan.size(); i++){
        // if(listPlan.get(i).equals(tnp)){
        // cnt++;
        // listPlan.remove(i);
        // }
        // }

        // list2.add(tnp);
        // }

        // System.out.println(list2);




        
        // Создать список типа ArrayList<String>.
        // Поместить в него как строки, так и целые числа.
        // Пройти по списку, найти и удалить целые числа.

        ArrayList<Object> listPlan = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            if (new Random().nextBoolean()) {
                listPlan.add(planet[new Random().nextInt(planet.length - 1)]);
            } else {
                listPlan.add(new Random().nextInt(planet.length - 1));
            }

        }
        System.out.println(listPlan);

        java.util.Iterator<Object> i = listPlan.iterator();
        while (i.hasNext()) {
            Object s = i.next();
            if (s instanceof Integer) {
                i.remove();
            }
        }
        System.out.println(listPlan);
    }

}

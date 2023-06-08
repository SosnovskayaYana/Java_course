// Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, 
// метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
// Формат данных Integer.


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class seminar_6 {
    public static void main(String[] args) {
        MySet<Integer> numbers = new MySet<>();

        for (int i = 0; i < 5; i++) {
            numbers.addNum(new Random().nextInt(100));
        }

        // for (int i = 0; i < 10; i++){
        // System.out.println(numbers.remove(new Random().nextInt(10)));
        // }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(numbers.contains(new Random().nextInt(10)));
        // }
 
        // Iterator <Integer> iter = numbers.iterator();
        // while (iter.hasNext()) {
        //     int a = iter.next();
        //     if (a % 2 == 0){
        //         System.out.println(a);
        //     }
        // }

        System.out.println(numbers);

        Scanner in = new Scanner (System.in);
        System.out.print("Введите индекс элемента: ");
        int index = in.nextInt();
        in.close();
        
        numbers.indexElem(index);

    }
}


class MySet<T> {

    private HashMap<T, Object> myMap = new HashMap<>();
    private static final Object MYOBJECT = new Object();


    public void addNum(T i) {
        myMap.put(i, MYOBJECT);
    }


    public boolean remove(T i) {
        return myMap.remove(i) == MYOBJECT;
    }


    public boolean contains(T i) {
        return myMap.containsKey(i);
    }


    @Override
    public String toString() {

        StringBuilder str = new StringBuilder("[");
        Iterator<T> iter = myMap.keySet().iterator();

        while (iter.hasNext()){
            str.append(iter.next() + ", ");
        }
        str.append("]");

        return str.toString();
    }




    public void indexElem(int ind) {

        Iterator<T> iter = myMap.keySet().iterator();
        String s = "";

        while (iter.hasNext()){
            s = s + iter.next() + ",";
        }

        String[] arrayStr = s.split(",");

        for (int i = 0; i < arrayStr.length; i++){
            if(i == ind){
                System.out.println("Элемент с индексом " + ind + " ->  " + arrayStr[i]);
            } 
        }
    }




    public Iterator <T> iterator(){
        return myMap.keySet().iterator();
    }

}

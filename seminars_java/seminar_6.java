
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class seminar_6 {
    public static void main(String[] args) {
        MySet<Integer> numbers = new MySet<>();

        for (int i = 0; i < 100; i++) {
            numbers.addNum(new Random().nextInt(1000));
        }

        // for (int i = 0; i < 10; i++){
        // System.out.println(numbers.remove(new Random().nextInt(10)));
        // }

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(numbers.contains(new Random().nextInt(10)));
        // }

          
        Iterator <Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            int a = iter.next();
            if (a % 2 == 0){
                System.out.println(a);
            }
        }


        System.out.println(numbers);
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
            str.append(iter.next() + ",");
        }
        str.append("]");

        return str.toString();
    }

    public Iterator <T> iterator(){
        return myMap.keySet().iterator();
    }

}

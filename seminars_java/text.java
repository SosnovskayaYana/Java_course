// import java.util.*;
public class text {
    public static void main(String[] args) {

        /* 
        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        s = s + "!";
        // перед каждой 'ненужной' ковычкой ставим \ тогда программа не читает их
        // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        */





        // int n = Integer.toBinaryString(new Random().nextInt(2000)).length();
        // создаем рандомные числа, узнаем длинну, переводим в бинарную систему






        // string = "Hello World";
        // string += "!";
        // System.out.println(string.length());
        // System.out.println("_".repeat(40));
        // System.out.println(string.charAt(2));
        // System.out.println(string.toLowerCase());
        // System.out.println(string.toUpperCase());
        // System.out.println(string.equals("Wo"));
        // System.out.println(string.contains("Wo"));
        // System.out.println(string.concat("?"));
        // System.out.println(string.replace("l", "ru"));
        // System.out.println(string.indexOf("l"));
        // System.out.println(string.lastIndexOf("l"));
        // System.out.println(string.endsWith("!"));
        // System.out.println(string.substring(0, string.length()/2));
        // System.out.println(Arrays.toString(string.split(" ")));

        // System.out.println(string);

        // string = stringBuilder.toString();
        // stringBuilder.append('!');
        // System.out.println(stringBuilder.reverse());
        // System.out.println(stringBuilder.deleteCharAt(1));
        // System.out.println(stringBuilder.insert(1, "?"));
        // System.out.println(stringBuilder.reverse());
        // System.out.println(stringBuilder.replace(0, stringBuilder.indexOf("o")+1, "My"));
        // System.out.println(stringBuilder);





        // время выполнения программы
        // String s = "";
        // StringBuilder sb = new StringBuilder("");
        // long start = System.currentTimeMillis();
        // for (int i = 0; i < 10000; i++) {
        //     s = s + Character.getName(i);
        // }
        // long end = System.currentTimeMillis();
        // System.out.println("String time:" + (end - start));





            /* 
        Object object = new Object();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(0, 5);
        list.add(0, 4);
        list.add(0, 3);
        list.get(2);
        list.remove(1);
        list.set(0, 12);
        if (list.size() == 0);
        if (list.isEmpty());
        list.contains(3);
        list.indexOf(3);
        list.lastIndexOf(3);
//        list2.addAll(list);
        list.clear();
//        System.out.println( list.get(0) );



        for (int i = 0; i < 5; i++) {
            list.add(new Random().nextInt(10));
            list2.add(new Random().nextInt(10));
        }



//        for (int i: list) {
//            System.out.println(i);
//        }



//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            System.out.println(i);
//            iterator.remove();
//        }


//        ListIterator<Integer> iterator = list.listIterator(list.size()-1);
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            System.out.println(i);
//            iterator.remove();
//        }


//        list.forEach(n -> System.out.println(n));



        System.out.println(list);
        System.out.println(list2);
        System.out.println("-".repeat(16));
//        list.removeAll(list2);
        list.retainAll(list2);
        System.out.println(list);
//        list2.sort(Comparator.reverseOrder());



        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%3!=0 && o2>6) return 0;
                if (o2%3!=0 && o1==1) return 1;
                return -1;
            }
        });
        
        System.out.println(list2);
        */

    }}
// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.


// public class seminar_2 {
//     public static void main(String[] args) {
//         int n = 8;
//         String c1 = "+", c2 = "*";
//         System.out.println((c1 + c2).repeat(n/2));

//     }
    
// }




// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd
// abcd

// public class seminar_2 {
//     public static void main(String[] args) {
//         String str = "aaaabbbcdd";
//         String str2 = "";
//         System.out.println(str);
//         int cnt = 0;
//         while (str.length()>0){
//             str2+= String.valueOf(str.charAt(0));
//             str = str.replace(String.valueOf(str2.charAt(cnt)),"");
//             cnt++;
//         }
//         System.out.println(str2);

//     }
// }





//Пример:stones = “aaaAbbbB” Результат: ”a3B1”
// Посчитайте сколько ’’драгоценных камней’’ в куче ’’обычных камней’’

// public class seminar_2 {
//     public static void main(String[] args) {

//         // String jewels = "aB";
//         String stones = "aaaAbbbB";
//         int a = stones.length()-stones.replace("a","").length();
//         int b = stones.length()- // длина первоначальной строки отнимаем
//                 stones.
//                         replace("B","").
//                         length();
//         System.out.println("a"+ a + "B" + b);
//     }}











import java.util.Arrays;

public class seminar_2 {

    static String string;
    static StringBuilder stringBuilder = new StringBuilder("Hello World!");

    public static void main(String[] args) {

        string = "Hello World";
        string += "!";
        System.out.println(string.length());
        System.out.println("_".repeat(40));
        System.out.println(string.charAt(2));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.equals("Wo"));
        System.out.println(string.contains("Wo"));
        System.out.println(string.concat("?"));
        System.out.println(string.replace("l", "ru"));
        System.out.println(string.indexOf("l"));
        System.out.println(string.lastIndexOf("l"));
        System.out.println(string.endsWith("!"));
        System.out.println(string.substring(0, string.length()/2));
        System.out.println(Arrays.toString(string.split(" ")));

        System.out.println(string);

        string = stringBuilder.toString();
        stringBuilder.append('!');
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.deleteCharAt(1));
        System.out.println(stringBuilder.insert(1, "?"));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.replace(0, stringBuilder.indexOf("o")+1, "My"));
        System.out.println(stringBuilder);


        String s = "";
        StringBuilder sb = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s = s + Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("String time:" + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start));

        String c1 = "a", c2 = "b";
        int n = 6;
        if (n%2 != 0 ) n--;
        System.out.println(((c1+c2).repeat(n/2)));

/* //        byte[] ints = new byte[]{10, 11, 12};
//
//        byte[] tmp = new byte[ints.length + 1];
//        for (int i = 0; i < ints.length; i++) {
//            tmp[i] =ints[i];
//        }
//        ints = tmp;
//        ints[ints.length-1] = '!';
//
//        System.out.println(ints[3]);
//        System.out.println(Arrays.toString(ints));  */

        String str = "aaaabbbcdd";
        String str2 = "";
        System.out.println(str);
        int cnt = 0;
        while (str.length()>0){
            str2+= String.valueOf(str.charAt(0));
            str = str.replace(String.valueOf(str2.charAt(cnt++)),"");
        }
        System.out.println(str2);

    }
}
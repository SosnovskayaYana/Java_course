// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}



package DZ_java.dz_2_java;


public class task_1 {
    public static void main(String[] args) {
        
        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        // StringBuilder str = new StringBuilder();

        s = s.replace("{", "").replace("}", "");

        System.out.println(s);
    }
}


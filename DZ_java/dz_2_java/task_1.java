// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package DZ_java.dz_2_java;

// import java.util.Arrays;

public class task_1 {

    public static void main(String[] args) {

        // String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\",\"city\":\"Moscow\", \"age\":\"null\"}";
    
        // StringBuilder str = new StringBuilder();

        // s = s.replace("{", "").replace("}", "");
        // System.out.println(s);

        // String[] arrayStr = s.split(", ");

        // System.out.println(Arrays.toString(arrayStr));

        // for (String filter : arrayStr) {
        //      String[] keyValue = filter.split(":");
        //      String key = keyValue[0].replace("\"", "");
        //      String value = keyValue[1].replace("\"", "");

        //      if (!"null".equals(value)) {
        //          if (str.length() > 0) {
        //              str.append(" AND ");
        //          }
        //          str.append(key).append(" = '")
        //              .append(value).append("'");
        //      }
        // }

        // System.out.println(Arrays.toString(keyValue));



        // Дальше не идет. не дает вывести keyValue. исправление ошибок создает новый
        // приват метод.
        // и keyValue выдает значение null.
        // не разобралась (((


        // далее скопированное решение, на которое я ориентировалась. оно полностью
        // рабочее.
        // свою ошибку я так и не нашла...





        String jsonFilter = "{\"name\":\"Ivanov\", \"country\":\"Russia\",\"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder str = new StringBuilder();

        // Делаем реплейс значений в строки jsonFilter получая строку
        // "\"name\":\"Ivanov\", \"country\":\"Russia\",
        // \"city\":\"Moscow\",\"age\":\"null\""
        jsonFilter = jsonFilter
                .replace("{", "")
                .replace("}", "");

        // разделяем строку
        // // на строки "\"name\":\"Ivanov\"" "\"country\":\"Russia\""
        // "\"city\":\"Moscow\"" "\"age\":\"null\""
        String[] filters = jsonFilter.split(", ");

        // задаем цикл на разделение строк на ключ и значение
        for (String filter : filters) {
            String[] keyValue = filter.split(":"); // key = \"name\" value = \"Ivanov\"
            String key = keyValue[0].replace("\"", "");// key = name
            String value = keyValue[1].replace("\"", ""); // value = Ivanov

            // обработчик для null значения
            if (!"null".equals(value)) { // если value != null
                // если длинна запроса не пустая добавляем еще разделитель
                if (str.length() > 0) {
                    str.append(" AND ");
                }
                // добавляем часть запроса
                str
                        .append(key).append(" = '")
                        .append(value).append("'");
            }
        }

        String sqlQuery = "SELECT * FROM students WHERE " + str;
        System.out.println(sqlQuery);

    }
}
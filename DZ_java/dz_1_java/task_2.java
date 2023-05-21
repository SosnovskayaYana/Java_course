/* Вывести все простые числа от 1 до 1000 */

package DZ_java.dz_1_java;
public class task_2 {

    public static void main(String[] args) {

        String prime = "";

        for (int i = 2; i <= 1000; i++){
            boolean primeNum = true;

            for (int j = 2; j <i; j++){
                if (i % j == 0){
                    primeNum = false;
                    break;
                }
            }
            
            if (primeNum){
                prime = prime + i + ", ";
            }
        }
        System.out.println("Простые числа от 1 до 1000: " + prime);

    }
}

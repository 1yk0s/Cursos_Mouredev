package bucles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class forEach {
    public static void main(String[] args) {
        //Declaración de Array
        String[] names = {"Kevin", "Alonso", "1yk0s"};

        //Bucle for each
        for (String names2 : names) {
            System.out.println(names2);
        }

        //Declaración de Set
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer numbers2 : numbers) {
            System.out.println(numbers2);
        }

        //Declaración de HashMap
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Kevin", "kevin.alonso.moran@gmail.com");
        emails.put("L0b0", "ellobodelbit@gmail.com");
        emails.put("1yk0s", "1yk0s.amar00k@gmail.com");

        for (Map.Entry<String, String> emails2 : emails.entrySet()) {
            System.out.println(emails2);
            //Acceder a las claves
            System.out.println(emails2.getKey());
            //Acceder a los valores
            System.out.println(emails2.getValue());
        }
    }
}

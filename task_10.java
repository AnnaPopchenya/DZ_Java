/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.
 */



import java.util.ArrayList;
import java.util.HashMap;


public class task_10 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> name1 = new ArrayList<>();
        name1.add("Anna");
        phoneBook.putIfAbsent("+375298014925, +375292081291", name1);
        ArrayList<String> name2 = new ArrayList<>();
        name2.add("Olga");
        phoneBook.putIfAbsent("+375333039330", name2);
        ArrayList<String> name3 = new ArrayList<>();
        name3.add("Anna");
        phoneBook.putIfAbsent("+375336853417", name3);
        ArrayList<String> name4 = new ArrayList<>();
        name4.add("Mikhail");
        phoneBook.putIfAbsent("+375445544811, +375295444432, +375292299311", name4);
        ArrayList<String> name5 = new ArrayList<>();
        name5.add("Mikhail");
        phoneBook.putIfAbsent("+375336859417", name5);

        System.out.println("Вывод по убыванию числа телефонов: " );
        phoneBook.forEach((key, value) ->
                System.out.println(value + " " + key));
    }
}
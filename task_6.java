/**
 * Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
 */



import java.util.ArrayList;
import java.util.Random;

public class task_6 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) numList.add(new Random().nextInt(15));
        System.out.println(numList);
        System.out.println("Нужно удалить из него чётные числа");
        ArrayList<Integer> numList1 = numList;
        for (int i = 0; i < numList1.size(); i++){
            if (numList1.get(i) % 2 == 0){
                numList1.remove(i);
                i--;
            }
        }
        System.out.println(numList1);
    }
}
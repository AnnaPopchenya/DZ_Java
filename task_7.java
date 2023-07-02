
/**
 * Пусть дан произвольный список целых чисел.
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */

import java.util.ArrayList;
import java.util.Random;

public class task_7 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            numList.add(new Random().nextInt(15));
        System.out.println(numList);
        System.out.println("Найти минимальное и максимальное значение: ");
        int min = numList.get(0);
        int max = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            if (numList.get(i) < min)
                min = numList.get(i);
            if (numList.get(i) > max)
                max = numList.get(i);
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Среднее значение: ");
        int average = 0;
        for (int i = 0; i < numList.size(); i++)  average += numList.get(i);
        System.out.println(average / numList.size());
    }
}

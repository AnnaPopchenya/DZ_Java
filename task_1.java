/**1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 * 
 */
  
import java.util.Scanner;
 public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите цифру: ");
        int n = in.nextInt();
        in.close();
        int sum_n = 0;
        int fac_n = 1;
                
        for (int i = 1; i < n+1; i++) {
            sum_n = sum_n + i;
        }
        System.out.print("Сумма чисел от единицы до введенного числа равна: ");
        System.out.println(sum_n);

        for (int i = 1; i < n+1; i++) {
            fac_n = fac_n * i;
        }

        System.out.print("Факториал указанного числа равен: ");
        System.out.println(fac_n);
    }

}
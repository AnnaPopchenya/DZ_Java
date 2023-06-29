/**
 * 4) К калькулятору из предыдущего дз добавить логирование.
 */

import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;

public class task_5 {
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;
    }    
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(task_5.class.getName());
        FileHandler fh = new FileHandler("log_calc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        logger.info(Float.toString(num1));
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        logger.info(operations);
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        logger.info(Float.toString(num2));
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        logger.info(Float.toString(num1) + " " + operations + " " + Float.toString(num2) + " " + "=" + " " + result);
    }

}
/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */

 import java.util.Scanner;
 public class ht1 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число a:");
    int x = sc.nextInt();
    System.out.println("Введите число b:");
    int y = sc.nextInt();
    sc.close();

    System.out.println(isSumBetween10And20(x, y));
    
    }
    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b <= 20 && a + b >= 10){
            return true;
        }
        return false;
    }

 }
// проверить, что сумма a и b лежит между 10 и 20

import java.util.Scanner;
public class ht2 {
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
            if (a + b < 20 && a + b > 10){
                return true;
            }
            return false;
        }
    
     }
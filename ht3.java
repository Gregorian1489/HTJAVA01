// проверить, что х положительное

import java.util.Scanner;
public class ht3 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число: ");
    int x = sc.nextInt();
    sc.close();
    
    System.out.println(isPositive(x));
        
    }
    private static boolean isPositive(int x) {
        if (x >= 0){
            return true;
        }
        return false;
    }
    
}

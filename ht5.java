// проверить, является ли год високосным. если да - return true

import java.util.Scanner;
public class ht5 {

public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите год: ");
    int x = sc.nextInt();
    sc.close();    
    
    System.out.println(isLeapYear(x));
}
private static boolean isLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        return true;
    }
    return false;
}
}
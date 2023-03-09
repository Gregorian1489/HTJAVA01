 // напечатать строку source repeat раз

import java.util.Scanner;
public class ht4 {

public static void main(String[] args) {    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String name = sc.nextLine();
    System.out.println("Введите кол-во повторений: ");
    int x = sc.nextInt();
    sc.close();

    printString(name, x);
}
    private static void printString(String source, int repeat) {
        String result = "";
        for (int i = 1; i <= repeat; i++) {
            result += source;
        }
        System.out.println(result);
    }
}    
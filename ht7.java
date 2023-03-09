/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/
import java.util.Scanner;
public class ht7 {

public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int num1 = sc.nextInt();
    sc.close(); 
    createArray(num1);
    
}
public static void createArray(int len) {
    int[] array = new int[len];
    for (int i = 0; i < array.length; i++) {
        array[i] = (int) Math.round(Math.random() * 1);
    }
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");  
    }
    System.out.println();
    for (int i = 0; i < array.length; i++) {
        if (array[i] == 0){
            array[i] = 1;
        }
        else if (array[i] == 1){
            array[i] = 0;
        }
    }
    System.out.print("Измененный массив:" + "\n");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");  
    }
    System.out.println();
}
}

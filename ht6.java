// должен вернуть массив длины len, каждое значение которого равно initialValue

import java.util.Scanner;
public class ht6 {

    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int num1 = sc.nextInt();
    System.out.println("Введите значения массива: ");
    int num2 = sc.nextInt();
    sc.close();         
    printArray(createArray(num1, num2));
}
private static int[] createArray(int len, int initalValue) {
    int[] array = new int[len];
    for (int i = 0; i < array.length; i++) {
        array[i] = initalValue;
    }
    return array;
}
public static void printArray(int[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {
        System.out.print(inputArray[i] + " ");
    }
    System.out.println();
}
}
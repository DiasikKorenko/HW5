import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = {{1, 2}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
       /* int num;
        System.out.println("Прибавление разных чисел,к каждому элементу");
        System.out.println("Введите набор чисел,которые будут прибавляться к элементу(по очереди)");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                num = scanner.nextInt();
                array[i][j] += num;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
        int num_2;
        int sum = 0;
        System.out.println("Прибавление одного числа,к каждому элементу");
        System.out.println("Введите одно число ");
        num_2 = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += num_2;
                System.out.print(array[i][j] + " ");
                sum += array[i][j];

            }
            System.out.println();

        }
        System.out.println("Сумма элементов = " + sum);
    }
}
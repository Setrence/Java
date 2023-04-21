

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DZ_Sem_3_2 {
    public static void main(String[] args) {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(20);
                ar.add(x);
            }
            System.out.println("Сгенерированный список целых чисел: \n " + ar);
            int max = ar.get(0);
            int min = ar.get(0);
            int sum = 0;
            for (Integer integer : ar) {
                if (integer > max) max = integer;
                if (integer < min) min = integer;
                sum = sum + integer;
            }
            System.out.printf("Максимальный элемент: %d\n", max);
            System.out.printf("Минимальный элемент: %d\n", min);
            System.out.printf("Среднее арифметическое: %.1f\n", ((float) sum / ar.size()));

        }

    }
}
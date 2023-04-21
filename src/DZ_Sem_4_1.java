

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;
public class DZ_Sem_4_1 {
    public static void main(String[] args) {
//        Первый способ:
//        System.out.print("Введите длину списка N: ");
//        try (Scanner iScanner = new Scanner(System.in)) {
//            int N = iScanner.nextInt();
//            ArrayList<Integer> ar = new ArrayList<Integer>();
//            Random ran = new Random();
//                for (int i = 0; i < N; i++) {
//                    int x = ran.nextInt(N);
//                    ar.add(x);
//                }
//            System.out.println("Сгенерированный список целых чисел: \n " + ar);
//            System.out.println("Перевернутый сгенерированный список:");
//                for (int i = 0; i < N; i++) {
//                    System.out.print("  " + ar.get(ar.size() - 1));
//                    ar.remove(ar.size() - 1);
//                }
//        }

        LinkedList<Integer> ar = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            ar.add(random());
        }
        System.out.println("Сгенерированный список:");
        System.out.println(ar);

        System.out.println("Перевернутый список:");
        for (int i = 0; i < 20; i++) {
            System.out.print(" " + ar.getLast() + " ");
            ar.removeLast();
        }
    }
    public static int random() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
import java.util.LinkedList;
public class DZ_Sem_4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> ar = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(ar, random());
        }
        System.out.println(ar);

        System.out.println(dequeue(ar));
        System.out.println(ar);

        System.out.println(first(ar));
        System.out.println(ar);
    }

    public static void enqueue(LinkedList<Integer> ar, int num) {
        ar.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ar) {
        int num = ar.get(0);
        ar.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ar) {
        int num = ar.get(0);
        return num;
    }

    public static int random() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

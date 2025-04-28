
import java.util.Scanner;

public class fibonaki {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println("Number is = " + fibonakiNumber(x));
        }
    }

    public static int fibonakiNumber(int x) {
        int a = 0, b = 1;
        if (x == 1) {
            return 1;
        }
        int[] arr = new int[x];
        arr[0] = b;
        arr[1] = a + b;
        for (int i = 2; i < x; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int d : arr) {
            System.out.print(d + " ");

        }
        System.out.println();
        return arr[x - 1];
    }
}

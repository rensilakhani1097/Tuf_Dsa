
import java.util.Scanner;

public class printTable {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int multiplier = 10;
            while(multiplier>=1)
            {
                System.out.print(x*multiplier + " ");
                multiplier--;
            }
        }

    }
}

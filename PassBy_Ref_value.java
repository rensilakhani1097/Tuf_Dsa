import java.io.IOException;
import java.util.Scanner;

public class PassBy_Ref_value {
   public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution obj = new Solution();
            System.out.println("Before Passing value n is : " + n + " m is :" + m);
            int ans[] = obj.passedBy(n, m);
            System.out.println("After Passing value n is : " + n + " m is :" + m);

            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}
class Solution {
    static int[] passedBy(int a, int b) {
        return new int[]{a+1,b+2};
    }
}
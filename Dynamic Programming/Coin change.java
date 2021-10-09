import java.util.*;
public class Coin {
    static int calc(int tg, int a[], int dp[]) {
        if (tg == 0)
            return 0;
            int ans = Integer.MAX_VALUE;
            for (int i : a) {
                if (tg - i >= 0) {
                    int subAns = (dp[tg-i] == -1)? calc(tg - i, a, dp) : dp[tg-i];
                    if( subAns != Integer.MAX_VALUE && subAns + 1 < ans)
                    ans = subAns + 1;
                }   
            }
            return dp[tg] = ans;
        }
        
        public static void main(String args[]) {
            int deno[] = { 1, 5, 7};
            int tg = 35;
            
            int dp[] = new int[tg + 1];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            System.out.print(calc(tg, deno, dp));
    }
}

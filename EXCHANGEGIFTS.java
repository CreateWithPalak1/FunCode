import java.util.*;

public class EXCHANGEGIFTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] give = new int[n + 1];
        int[] receive = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            give[a]++;
            receive[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (give[i] == 0 && receive[i] == n - 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
/*
Test Case 1
Input:
2 1
1 2

Output:
2


Test Case 2
Input:
3 2
1 3
2 3

Output:
3


Test Case 3
Input:
3 2
1 2
2 3

Output:
-1
*/

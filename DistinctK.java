import java.util.*;

public class DistinctK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] arr = new String[n];

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int k = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                count++;

                if (count == k) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
/*
Test Case 1
Input:
6
d
b
c
b
c
a
2

Output:
a


Test Case 2
Input:
3
dac
ba
a
1

Output:
dac
*/
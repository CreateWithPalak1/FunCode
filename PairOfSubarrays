import java.util.*;

class Main {

    public static long calculatePairs(int n, int[] arr) {

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        long ans = 0;

        // mid is the gap between the two non-overlapping subarrays
        for (int mid = 1; mid < n; mid++) {

            HashMap<Long, Long> left = new HashMap<>();

            // All subarrays ending at mid
            for (int l = 0; l < mid; l++) {
                long sum = prefix[mid] - prefix[l];

                left.put(sum, left.getOrDefault(sum, 0L) + 1);
            }

            // All subarrays starting at mid
            for (int r = mid + 1; r <= n; r++) {
                long sum = prefix[r] - prefix[mid];

                if (left.containsKey(sum)) {
                    ans += left.get(sum);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(calculatePairs(n, arr));

        sc.close();
    }
}
             

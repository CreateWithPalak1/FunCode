import java.util.*;

public class Main {

    public static int goodSum(int N, int[] A) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : A) {
            list.add(x);
        }

        int i = 0;

        while (i < list.size()) {

            if (list.get(i) < 0) {

                int x = -list.get(i);
                int sum = 0;
                int j = i - 1;

                while (j >= 0 && sum < x) {
                    sum += list.get(j);
                    j--;
                }

                if (sum < x) {
                    list.subList(0, i).clear();
                    i = 0;
                } else {
                    list.subList(j + 1, i).clear();
                    i = j + 1;
                }

                list.set(i, x);
            }

            i++;
        }

        int answer = 0;

        for (int x : list) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int result = goodSum(N, A);

        System.out.println(result);

        sc.close();
    }
}

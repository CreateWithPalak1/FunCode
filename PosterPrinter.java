import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            String s = sc.next();

            boolean possible = true;
            int i = 0;

            while (i < N) {

                if (s.charAt(i) == 'W') {
                    i++;
                    continue;
                }

                boolean hasB = false;
                boolean hasR = false;

                while (i < N && s.charAt(i) != 'W') {

                    if (s.charAt(i) == 'B') {
                        hasB = true;
                    }

                    if (s.charAt(i) == 'R') {
                        hasR = true;
                    }

                    i++;
                }

                if (!hasB || !hasR) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}

import java.util.*;

public class Main {

    public static int highestAltitude(int n, int[] gain) {

        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < n; i++) {
            altitude += gain[i];

            if (altitude > highest) {
                highest = altitude;
            }
        }

        return highest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] gain = new int[n];

        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = highestAltitude(n, gain);

        System.out.println(result);

        sc.close();
    }
}

import java.util.*;

public class right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n; i = 2 * i + 1) {
            while (i < n && arr[i] == -1) i++;
            if (i < n) {
                System.out.print(arr[Math.min(n - 1, 2 * i)] + " ");
            }
        }

        sc.close();
    }
}
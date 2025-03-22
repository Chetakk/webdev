import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Left Boundary
        for (int i = 0; i < n; i = 2 * i + 1) System.out.print(arr[i] + " ");

        // Leaf Nodes
        for (int i = 0; i < n; i++) 
            if (2 * i + 1 >= n && 2 * i + 2 >= n) System.out.print(arr[i] + " ");

        // Right Boundary (Reverse Order)
        List<Integer> rightBoundary = new ArrayList<>();
        for (int i = 0; i < n; i = 2 * i + 1) rightBoundary.add(arr[Math.min(n - 1, 2 * i)]);
        Collections.reverse(rightBoundary);
        for (int num : rightBoundary) System.out.print(num + " ");

        sc.close();
    }
}
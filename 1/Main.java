import java.util.Scanner;

public class Main {

    public static int findMax(int[] a) {
        int mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx) mx = a[i];
        }
        return mx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Max: " + findMax(a));
    }
}

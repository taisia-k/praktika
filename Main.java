public class Main {

    public static int findMax(int[] a) {
        int mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx) mx = a[i];
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1};
        System.out.println("Max: " + findMax(a));
    }
}

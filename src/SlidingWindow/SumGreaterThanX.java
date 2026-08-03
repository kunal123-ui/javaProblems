package SlidingWindow;
public class SumGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 3;
        int x = 10;
        int sum = 0;
        int count = 0;
        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum > x) {
            count++;
        }
        // Remaining windows
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum > x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
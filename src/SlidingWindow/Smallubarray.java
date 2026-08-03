package SlidingWindow;
public class Smallubarray {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            while (sum > target) {
                sum -= a[left];
                left++;
            }

        }

    }

}
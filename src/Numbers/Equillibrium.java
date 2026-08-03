package Numbers;

public class Equillibrium
{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int left=0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if(left == totalSum){
                System.out.print("Eqillibrium");
                return;
            }
            left += arr[i];
        }
        System.out.print("Not Eqillibrium");
    }
}
package SlidingWindow;
public class VowelsSubstring {
    public static boolean vow(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        String w = "abciiidef";
        int k = 3;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vow(w.charAt(i))){
                count++;
            }
    }
    int max=count;
        for (int i = k; i < w.length(); i++){
            if(vow(w.charAt(i-k))){
                count--;
            }
            if(vow(w.charAt(i))){
                count++;
            }
            max=Math.max(max,count);
        }
        System.out.print(max);
    }

}
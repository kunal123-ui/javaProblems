package String;
import java.util.*;
class PerumutationStrings{
    public static void permute(String s,String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);               // Pick                                    ABCDE
            String rem = s.substring(0, i) + s.substring(i + 1); // Remove  "AB" + "DE"    ABDE
            permute(rem, ans + ch);                // Recurse
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        permute(s, "");
    }
}
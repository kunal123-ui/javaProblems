package String;

import java.util.*;

class RevString{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String W = sc.nextLine();
        String res="";
        for (int i=W.length()-1;i>=0;i--){
            char c=W.charAt(i);
            res=res+c;
        }
        System.out.print(res);
    }
}
package String;
import java.util.*;
public class remvow
{
    public static boolean vow(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w="hello";
        String r="";
        for(int i=0;i<w.length();i++){
            if(!vow(w.charAt(i))){
                r+= w.charAt(i);
            }
        }
        System.out.print(r);
    }
}
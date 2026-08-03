package String;
import java.util.*;
class SepUpLow{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String l="";
        String U="";

        for (int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                U +=s.charAt(i);
            }else{
                l +=s.charAt(i);
            }
        }
        System.out.println(U);
        System.out.println(l);
    }

        }
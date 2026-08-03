package String;

import java.util.*;
class AlphabetorNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char str=sc.next().charAt(0);
        if((str >= 'a' && str<='z')|| (str >= 'A' && str<='Z')){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
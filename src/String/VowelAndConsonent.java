package String;

import java.util.*;
class VowelAndConsonent{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char str=sc.next().toLowerCase().charAt(0);
        if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'){
            System.out.print("vowels");
        }else{
            System.out.print("consonents");
        }
    }
}
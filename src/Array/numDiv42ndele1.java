package Array;
import java.util.Scanner;
class numDiv42ndele1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char []a=sc.next().toCharArray();
        for(int i=0;i<a.length-1;i++){
          int res=  ((a[i]-'0')*10)+(a[i+1]-'0');
          if(res%4==0){
              a[i+1]='1';
          }
        }
        System.out.println(new String(a));

    }
}
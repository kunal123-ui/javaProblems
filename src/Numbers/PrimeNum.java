package Numbers;
import java.util.*;
class PrimeNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in) ;
        int n=sc.nextInt();
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n<2){
                prime=false;
            }
            if(n%i==0){
                prime=false;
            }
        }
        if(prime){
            System.out.print("prime");
        }else{
            System.out.print("Not prime");
        }
    }
}
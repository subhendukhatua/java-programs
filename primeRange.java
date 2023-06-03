import java.util.*;

public class primeRange {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            isPrime=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }

    public  static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        primeInRange(20);

    }
}

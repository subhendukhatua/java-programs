import java.util.Scanner;

public class evenOddinBitManupulation {

    public static void checkEvenOdd(int n){
        if((n & 1)==0){
            System.out.println("Entered number is Even");
        }else{
            System.out.println("Enterd number is Odd");
        }
    }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for check Even or Odd :");
        int n = sc.nextInt();
        checkEvenOdd(n);

    }   
}

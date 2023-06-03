import java.util.Scanner;

public class getIthBit {


    public static void getBit(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask)!= 0){
            System.out.println("the "+ i + "th position bit is 1");
        }else{
            System.out.println("the "+ i + "th position bit is 0");
        }
    }

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Enter the position for find the bit :");
        int i =sc.nextInt();
        getBit(n, i);
        
    }
}

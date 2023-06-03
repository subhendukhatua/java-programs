import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int check;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("enter the number"+ "  ");
            number = sc.nextInt();
            if(number%2==0){
                evenSum=evenSum+number;
            }else{
                oddSum=oddSum+number;
            }
            System.out.println("enter 1 for continue or 0 for no"+" ");
            check=sc.nextInt();
                 
        }while(check==1);
        System.out.println("sum of even number is   "+ evenSum);
        System.out.println("sum of odd number is    "+ oddSum);
    }
}
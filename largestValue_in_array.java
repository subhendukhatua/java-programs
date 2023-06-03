import java.util.*;
public class largestValue_in_array {
    public static int largest(int number[]){
        int large=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            if(number[i]>large){
                large=number[i];
            }
            
        }
        return large;
    }
    public static void main(String args[]){
        int number[]={1, 3, 6, 9, 12, 2, 4, 5};
        System.out.println("large number is: "+ largest(number));

    }
}

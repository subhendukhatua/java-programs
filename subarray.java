public class subarray {

    public static void printSubarray(int number[]){
      
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+number[k];
                    System.out.print(number[k]+" ");
                    
                }
                System.out.println("   sum is: "+sum);
                if(maxSum<sum){
                    maxSum=sum;
                }
                
            
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum is: "+ maxSum);
    }
    public static void main(String args[]){
        int number[]={2, 4, 6, 8, 10};
        printSubarray(number);
    }
}

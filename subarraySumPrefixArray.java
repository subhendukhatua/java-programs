public class subarraySumPrefixArray {
    public static void printSumSubarray(int number[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        //calculate the prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length; j++){
                int end=j;
                currentSum= start==0? prefix[end]: prefix[end]-prefix[start-1];
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }

        }   
        System.out.println("Maximum sum is:  "+ maxSum);
    }
    public static void main(String args[]){
        int number[]={2, 4, 6, 8, 10};
        printSumSubarray(number);
    }
}

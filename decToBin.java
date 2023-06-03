public class decToBin {
    public static void decNum(int n){
        int sum =0;
        int pow=0;

        while(n>0){
            int rem=n%2;
            sum=sum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        decNum(64);
       
    }
    
}

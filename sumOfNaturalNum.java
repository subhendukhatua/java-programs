public class sumOfNaturalNum {

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }


        int sum =n+calcSum(n-1);
        return sum;
    }
    public static void main(String abc[]){
        System.out.println(calcSum(5));

    }
    
}

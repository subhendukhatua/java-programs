public class optimizePowerfunction {


    public static int power(int x,int n){


        if(n==0){
            return 1;
        }

        int a =power(x, n/2);
        int powerSquare=a*a;

        if(n%2!=0){
            powerSquare=x*powerSquare;
        }

        return powerSquare;

    }
    public static void main(String []abc){
        System.out.println((power(2, 3)));

    }
    
}

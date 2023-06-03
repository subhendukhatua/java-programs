public class butterflyPattern {
    public static void butterfly(int n){
        // 1st half
        for(int i=1;i<=n;i++){    //outer loop
            for(int j=1;j<=i;j++){   //inner loop for print star
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){     //inner loop for print space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){            //inner loop for print star
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){               //loop for print mirror image of 1st half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
    public static void main(String args[]){
        butterfly(4);
    }
}

public class invertedHalfPyramid {
    public static void inverted_half_pyramid_withNumber(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String ags[]){
        inverted_half_pyramid_withNumber(5);
    }
}

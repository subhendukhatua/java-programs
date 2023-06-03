public class clearIBits {

    public static int clearBits(int n,int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }





    public static void main(String args[]){
        System.out.println(clearBits(15, 2));

    }
}

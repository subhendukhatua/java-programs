public class setIthBit {
    public static int setBit(int n,int i){
        int bitmask =1<<i;
        return  n|bitmask;
    }
    public static void main(String args[]){
        System.out.println(setBit(10, 2));

    }
}

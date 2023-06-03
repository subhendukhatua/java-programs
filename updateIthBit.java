public class updateIthBit {
    // public static int clearBit(int n,int i){
    //     int bitmask =~(1<<i);
    //     return  n & bitmask;
    // }

    // public static int setBit(int n,int i){
    //     int bitmask =1<<i;
    //     return  n|bitmask;
    // }

    public static int updatebit(int n,int i,int newBit){
        if(newBit==0){
            int bitmask =~(1<<i);
            return  n & bitmask;
            

        }else{
            int bitmask =1<<i;
            return  n|bitmask;
        }
    }


    public static void main(String args[]){

        System.out.println(updatebit(10, 1, 0));

    }
}

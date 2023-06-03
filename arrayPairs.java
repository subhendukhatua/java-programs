public class arrayPairs {
    public static void printPair(int number[]){
        int toralPairs=0;

        for(int i=0;i<number.length;i++){
            int current=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+current+","+number[j]+")");
                toralPairs++;

            }
            System.out.println();
        }
        System.out.println("total pairs is: "+toralPairs);

    }
    public static void main(String args[]){
        int number[]={2, 4, 6, 8, 10};
        printPair(number);
    }
}

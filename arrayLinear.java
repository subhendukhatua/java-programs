public class arrayLinear {
    public static int linearSearch(int number1[],int key){
        for(int i=0;i<number1.length;i++){
            if(number1[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int number1[]={2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key=50;

        int index=linearSearch(number1, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("The key is in the index number: "+ index);
        }
    }
}

public class findFirstOccurance {

    public static int findOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return findOccurance(arr, key, i+1);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,5,5,7,8,9};
        System.out.println(findOccurance(arr, 10, 0));

    }
    
}

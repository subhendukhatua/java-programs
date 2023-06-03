public class chechSortedArray {

    public static boolean checkArr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return checkArr(arr, i+1);



    }

    public static void main(String abc[]){
        int arr[]={1,2,3,12,8};
        System.out.println(checkArr(arr, 0));

    }
    
}

public class selectionSort {
    public static void sortArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minVal=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minVal]>arr[j]){
                    minVal=j;
                }
            }
            //sort on outer loop
            int temp=arr[minVal];
            arr[minVal]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
    public static void main(String args[]){
        int arr[] = {3,9,18,13,10,8,7,6,};
        sortArray(arr);
        printArray(arr);

        
    
        
    }
}

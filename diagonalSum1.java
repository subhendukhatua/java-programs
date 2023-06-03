public class diagonalSum1 {
    public static int diagonal(int matrix[][]){
        int sum=0;
        for(int i =0;i<matrix.length;i++){
            
            sum+= matrix[i][i];
            if(i!= matrix.length-1-i)

            
                sum+= matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11 }};
                        
        
        System.out.print(diagonal(matrix));                

    }
}

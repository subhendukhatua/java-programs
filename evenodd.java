public class evenodd {
    public static boolean isEven(int n){
        boolean even=true;
        if(n%2!=0){
            even=false;
        }
        return even;
    }

    public static void main(String args[]){
        System.out.println(isEven(26));
    }
}

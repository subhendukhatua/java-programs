public class palindrome {
        public static void main(String args[]){
            int n=321;
            int rem;
            int sum=0;
            int temp=n;

            while(n>0){
                rem=n%10;
                sum=(sum*10)+rem;
                n=n/10;
            }
            if(temp==sum){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
    }

         


    
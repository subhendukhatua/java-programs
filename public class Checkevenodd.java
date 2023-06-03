public class Checkevenodd
{
public static void main(String arg[])
{
int num;
System.out.println("Enter the integer number:");
Scanner input=new Scanner(System.in);
num=input.nextInt();
if(num%2==0)
System.out.println("Entered number is even");
else
System.out.println("Entered number is odd");
}
}
import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[])
{
int n,a=0,b=0,c=1;
Scanner fib =new Scanner(System.in);
System.out.print("enter value:");
n=fib.nextInt();
System.out.print("Fibonacci Series");
for(int i=1;i<=n;i++)
{
a=b;
b=c;
c=a+b;
System.out.println(a+"");
}
}
}
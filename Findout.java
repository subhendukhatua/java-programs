import java.util.Scanner;
class Findout
{
public static void main(String arg[])
{
int temp1,temp2,num1,num2,temp,hcf,lcm;
Scanner find =new Scanner(System.in);
System.out.print("Enter the first number:");
num1=find.nextInt();
System.out.print("Enter the second number:");
num2=find.nextInt();
find.close();
temp1=num1;
temp2=num2;
while(temp2!=0)
{
temp=temp2;
temp2=temp1%temp2;
temp1=temp;
}
hcf=temp1;
lcm=(num1*num2)/hcf;
System.out.println("hcf of entered numbers:"+hcf);
System.out.println("lcm of input numbers:"+lcm);
}
}
class Nesting
{
 int m,n;
 Nesting(int x, int y)  //Constructor
{
 m=x;
 n=y;
}
int greatest()  
{
 if(m>=n)
   return(m);
 else
   return(n);
}
void display()   
{
 int great=greatest();     //calling a method
 System.out.println("The Greatest Value="+great);
}
}
class Nestmain
{
 public static void main(String args[])
{
 Nesting nest=new Nesting(10,20);
 nest.display();
}
}
class MathOperation
{
 static int multiple(int x,int y)
 {
  return x*y;
 }
static int divide(int x,int y)
{
 return x/y;
}
}
class MathApplication
{
 public static void main(String args[])
 {
  int a=MathOperation.multiple(4,2);  // calling static method
  int b=MathOperation.divide(4,2);
  System.out.println("Multiple = "+a);
  System.out.println("Divide = "+b);
 }
}
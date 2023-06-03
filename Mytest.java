
class Parent{
    void bike(){
        System.out.println("hero");
    }
  }
  
  class Chield extends Parent{
  void cycle(){
      System.out.println("atluse");
  }
  }
  
  
  
  
  
  public class Mytest{
  public static void main(String[] args){
    Chield c=new Chield();
    c.bike(); 
    c.cycle();
  
  }
  }
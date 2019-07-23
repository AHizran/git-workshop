public class Calculator{
    public int add(int a, int b){
        return a+b;
    }


  public double mul(double a, double b){
      return a*b;
  }

  public double sub(double a, double b){
      return a-b;
 }

  public double div(double a, double b){
     if(b != 0){ 
       return a/b;
     }
     return -1;
  }
}


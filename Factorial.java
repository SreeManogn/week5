public class Factorial{
  public static long compute(int n){
    if(n<0) throw new IllegalArgumentException("Negative number not allowed");
    long res=1;
    for(int i=2;i<=n;i++){
      res*=i;
    }
    return res;
  }
  public static void main(String args[]){
  int n=5;
    System.out.println("Factorial of a "+ n +"is"+compute(n));
  }
}



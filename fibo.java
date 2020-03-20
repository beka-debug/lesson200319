public class FibonacciWithMemoization {
 
 public static long fibArray[]=new long[26];
 
 public static long fibonacci(int n){
  long fibValue=0;
  if(n==0 ){
   return 0;
  }
  else if(n==1){
   return 1;
  }
  else if(fibArray[n]!=0){
   return fibArray[n];
  }
  else{
   fibValue=fibonacci(n-1)+fibonacci(n-2);
   fibArray[n]=fibValue;
   return fibValue;
  }
 }


import static org.junit.Assert*
import org.junit.Test

public class fibo-test
}
   @Test 
   public void fibo1 throws Exception{
       assertEquals("1", fibonacci.check(1) );
   }
    @Test 
   public void fibo2 throws Exception{
       assertEquals("2", fibonacci.check(2) );
   }
    @Test 
   public void fibo1 throws Exception{
       assertEquals("3", fibonacci.check(3) );
   }
    @Test 
   public void fibo1 throws Exception{
       assertEquals("5", fibonacci.check(4) );
   }
    @Test 
   public void fibo1 throws Exception{
       assertEquals("21", fibonacci.check(7) );
   }
}


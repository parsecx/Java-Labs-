import java.math.BigInteger;
public class TestClass {
	
  public static int sumOfSums(int n)
  {
    int result = 0;
    for(int i = 1; i <= n; i++) {
      result += sFinder(i);
      System.out.println(sFinder(i));
    }
    int finalResult = sFinder(result);
    return finalResult;
  }
	  
  private static int sFinder(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
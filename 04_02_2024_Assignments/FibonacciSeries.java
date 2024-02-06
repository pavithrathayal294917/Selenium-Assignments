package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10, fNum = 0, sNum = 1;
		    System.out.println("Fibonacci Series for " + n + " terms:");

		    for (int i = 1; i <= n; i++) {
		      System.out.print(fNum + ", ");

		      // compute the next term
		      int nextNum = fNum + sNum;
		      fNum = sNum;
		      sNum = nextNum;
		    }
			
		}

	

}

package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=45;
		boolean isPrime=false;
		for (int i = 2; i <= num-1; i++) {
			if(num%i==0)
			{
				isPrime=true;
				break;
				
				
			}
		}
			if(!isPrime)
			{
				System.out.println("The number " + num + " is a prime number");
			}
			else 
			{
				System.out.println("The number " + num + " is not a prime number");	
			}
		

	}

}

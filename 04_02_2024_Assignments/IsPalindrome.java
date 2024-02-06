package week1.day2;

import java.util.Iterator;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 242, rev = 0,r=num;  
		for (int i = 0; num > 0; num=num/10) {
			int remainder = num % 10;  
			rev = rev * 10 + remainder;    
			
		}
		if(rev==r) {
		System.out.println("The number " +r + " is a Palindrome");  
		}
		else
		{
			System.out.println("The number " +r + " is not a Palindrome");  
		}

	}

}

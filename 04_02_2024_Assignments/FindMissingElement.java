package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,3,2,8,6,7};
		Arrays.sort(a);
		System.out.println("Missing Elements: ");
		for (int i = a[0]; i < a.length; i++) {
			if(i+1!=a[i])
			{
				System.out.println(i+1);
				break;
				
			}
			
		}
	}

}

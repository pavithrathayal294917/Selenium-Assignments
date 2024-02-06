package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,6,7,9,11};
		int b[]= {7,6,11};
		System.out.println("The common values in the array are ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
				
			}
			
		}

	}

}

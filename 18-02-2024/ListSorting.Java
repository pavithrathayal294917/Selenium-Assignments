package Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr1 = new ArrayList<String>(); 
		 arr1.add("HCL");
		 arr1.add("Wipro");
		 arr1.add("Aspire Systems");
		 arr1.add("CTS");
		 Collections.sort(arr1);
		 int n=arr1.size();
		 System.out.println("Reversed List is: ");
		 for (int i = n-1; i >= 0; i--) {
			 System.out.println(arr1.get(i));
			
		}
		 

	}

}

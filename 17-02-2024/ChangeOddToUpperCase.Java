package week3.day1Assignments;

public class ChangeOddToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="changeme";
		char[] characters = word.toCharArray(); 
		StringBuffer updatedString = new StringBuffer(); 
		
		for(int i = 0; i < word.length(); i++) { 
			char c = characters[i]; 
			if(i%2==1)
			{
				c = Character.toUpperCase(c); 
			}
			updatedString.append(c); 
			//break;
			
		}
		System.out.println("Modified string is: " + updatedString.toString()); 
	}

}

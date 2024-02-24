package Week3;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence, result = "";
		String allWords[];
		sentence = ("We learn Java basics as part of java sessions in java week1");
		allWords = sentence.split(" ");
		for(int i=0; i<allWords.length; i++) 
		{
			if(i%2==1)
			{
			//char charArray[]=allWords[i].toCharArray();
			//System.out.println(allWords[i]);
			char charArray[]=allWords[i].toCharArray();
			System.out.print(" ");
			for (int j=charArray.length-1; j >=0 ; j--) {
				
				System.out.print(charArray[j]);
				
			}
			
			
			//break;
		
		}
			else
			{
				System.out.print(" ");
				System.out.print(allWords[i]);
			}
			
		}
		

	}

}

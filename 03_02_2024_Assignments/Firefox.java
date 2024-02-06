package week1.day1;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float browserVersion = 100.2f;
		String browserName = "firefox";
		boolean pageLoaded=true;
		int noOfBrowser=4;
		char browserLogo='f';
		
		System.out.println("Without Concatenation:");
		System.out.println("Browser Version: " + browserVersion);
		System.out.println("Browser Name: " +browserName);
		System.out.println("Is the Page Loaded: " +pageLoaded);
		System.out.println("Number of windows Open: " +noOfBrowser);
		System.out.println("Browser Logo: " +browserLogo);
		System.out.println("\n");
		System.out.println("With Concatenation:");
		// With single sysout
		System.out.println("Browser Version:  " +browserVersion + "\n" + "Browser Name: " +browserName +"\n" + "Is Visible: " +pageLoaded
				+"\n" + "Number of Windows Open: " +noOfBrowser + "\n" + "Browser Logo: " +browserLogo);

	}

}

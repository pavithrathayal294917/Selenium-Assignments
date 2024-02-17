package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		boolean enabled=driver.findElement(By.xpath("//label[text()='Bengaluru']")).isEnabled();
		if(enabled==true)
		{
			System.out.println("The status of City Radio Button is Selected on First Click");
		}
		else
		{
			System.out.println("The status of City Radio Button is unselected on First Click");
		}
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		boolean disabled=driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
		if(disabled==false)
		{
			System.out.println("The status of City Radio Button is Unselected on Second Click");
		}
		else
		{
			System.out.println("The status of City Radio Button is Selected on Second Click");
		}
		boolean selected=driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isDisplayed();
		System.out.println("Status is:" +selected);
		if(selected==true)
		{
			String sel_text=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
			System.out.println("Selected value is: " + sel_text);
		}
		boolean age=driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).isEnabled();
		System.out.println("Age is :" + age);
		if(age==true)
		{
			String age_value=driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).getText();
			System.out.println("Age " +age_value + " is Selected" );
		}

	}

}

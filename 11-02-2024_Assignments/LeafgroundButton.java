package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String page_title=driver.getTitle();
		System.out.println("Title:" +page_title);
		if(page_title.contains("Dashboard"))
		{
			System.out.println("Dashboard is Open");
		}
		else 
		{
			System.out.println("Dashboard is not Open");
		}
		driver.navigate().back();
		String disabledButton=driver.findElement(By.id("j_idt88:j_idt92")).getText();
		System.out.println("Disabled Button:" + disabledButton);
		if(disabledButton.contains("Disabled"))
		{
			System.out.println("Button is Disabled");
		}
		else
		{
			System.out.println("Button is Enabled");
		}
		Point location=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println("Location is:" + location);
		String bg_Color=driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println("Background is:" + bg_Color);
		Dimension e_size=driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println("Height is:" + e_size.height);
		System.out.println("Width is:" + e_size.width);

}
}


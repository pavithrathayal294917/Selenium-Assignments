package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxInteraction {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.manage().window().maximize();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	String message = driver.findElement(By.className("ui-growl-title")).getText();
	System.out.println("Message is:" + message);
	if((message.contains("Checked"))||(message.contains("Unchecked")))
	{
		System.out.println("Message displayed");
	}
	else
	{
		System.out.println("Message is not displayed");
	}
    driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[2]")).click();
    String message1=driver.findElement(By.className("ui-growl-title")).getText();
    System.out.println("Tristate Message is:" + message1);
    if((message.contains("Checked"))||(message.contains("Unchecked")))
	{
		System.out.println("Tristate Message displayed");
	}
	else
	{
		System.out.println("Tristate Message is not displayed");
	}
    driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
    String toggleMessage=driver.findElement(By.className("ui-growl-message")).getText();
    System.out.println("Toggle Message is:" + toggleMessage);
    if((toggleMessage.contains("Checked"))||(toggleMessage.contains("Unchecked")))
	{
		System.out.println("Toggle Message displayed");
	}
	else
	{
		System.out.println("Toggle Message is not displayed");
	}
    boolean verify=driver.findElement(By.id("j_idt87:j_idt102")).isEnabled();
    driver.findElement(By.xpath("//span[text()='Basic']")).click();
    boolean uncheck=driver.findElement(By.xpath("//span[text()='Basic']")).isEnabled();
    
    if(uncheck==true)
    {
    	System.out.println("Basic check box is Disabled");
    }
    else
    {
    	System.out.println("Basic check box is Enabled");
    }
    
    driver.findElement(By.id("j_idt87:multiple")).click();
    driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]")).click(); 
   // driver.close();
	}

}

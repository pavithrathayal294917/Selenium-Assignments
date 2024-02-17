package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9962029688");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String lead_id=
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=16319']")).click();
		String lead_info=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead id is:" + lead_info);
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9962029688");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.close();
	//	driver.findElement(By.className("//a[@class='subMenuButtonDangerous']")).click();
		

	}

}

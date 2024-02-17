package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Iris");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pavithra");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Pavi_T");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Test Lead Creation");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("email123@gmail.com");
		WebElement st = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(st);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test Important Note");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String page_title=driver.getTitle();
		System.out.println("Title:" + page_title);
		driver.close();
		
		
	}

}

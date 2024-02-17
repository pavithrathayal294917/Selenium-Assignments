package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']//li/following-sibling::li//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Pavithra Test2");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement ind =driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(ind);
		industry.selectByValue("IND_SOFTWARE");
		WebElement owner =driver.findElement(By.name("ownershipEnumId"));
		Select ownership=new Select(owner);
		ownership.selectByVisibleText("S-Corporation");
		WebElement emp =driver.findElement(By.id("dataSourceId"));
		Select employee=new Select(emp);
		employee.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing =driver.findElement(By.id("marketingCampaignId"));
		Select mark_campaign=new Select(marketing);
		mark_campaign.selectByIndex(7);
		WebElement st =driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state=new Select(st);
		state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		//driver.findElement(By.xpath("//td[@class='titleCell']//span[text()='Account Name']/following::span")).;
		//driver.findElement(By.xpath("//td[@class='titleCell']//span[text()='Account Name']/following::span[text()='Pavithra Test2']"));
		//System.out.println("Account Created Successfully");
		driver.close();
		
	
		
		//driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		
		}

}

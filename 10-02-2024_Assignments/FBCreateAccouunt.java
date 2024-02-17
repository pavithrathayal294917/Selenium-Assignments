package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBCreateAccouunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Pavitra");
		driver.findElement(By.name("lastname")).sendKeys("Thayal");
		driver.findElement(By.name("reg_email__")).sendKeys("pavithrathayal294917@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pavithrathayal294917@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Saibaba@123");
		WebElement d1 = driver.findElement(By.id("day"));
		Select day=new Select(d1);
		day.selectByVisibleText("29");
		WebElement d2 = driver.findElement(By.id("month"));
		Select month=new Select(d2);
		month.selectByVisibleText("Jun");
		WebElement d3 = driver.findElement(By.id("year"));
		Select year=new Select(d3);
		year.selectByVisibleText("1991");
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();
		

	}

}
